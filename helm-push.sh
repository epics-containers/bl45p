# TODO UNDER DEVELOPMENT
# WARNING - this needs genericizing
# all real beamlines should have CI to push to their private repos
# this is an example of how to do it to ghcr.io/epics-containers/

# helm pulishing CI script for beamline iocs
# uses image gcr.io/diamond-privreg/controls/prod/gitlab/gcloud-helm:0.2.2

# IMPORTANT: for new beamlines you will need to first create the beamline
# helm repo with:
#   module load gcloud
#   gcloud auth login --no-launch-browser
#   gcloud artifacts repositories create --location=europe \
#      --repository-format=docker bl40p-iocs

# TODO I think all this functionality should be placed in a
# gitlab runner image derived from gcr.io/diamond-pubreg/buildutil:0.0.0

helm version

set -e

# Helm Registry in diamond GCR
HELM_REPO=ghcr.io/epics-containers/


# turn on Open Container Initiative support
export HELM_EXPERIMENTAL_OCI=1

# log in to the registry
if [ -z ${CI_BUILD_ID} ]
then
    # this was run locally - get creds from gcloud and push to work repo
    echo "LOCAL deploy to helm repo"
    echo $CR_PAT | docker login ghcr.io -u USERNAME --password-stdin
else
    # running under Gitlab CI - get creds from /etc/gcp/config.json
    cat /etc/gcp/config.json | helm registry login -u _json_key \
      --password-stdin ${HELM_REPO}
fi

if [ -z "${CI_COMMIT_TAG}" ]
then
    # untagged builds go into the work repo instead of beamline repo
    CI_PROJECT_NAME="work"
    # determine the tag to use based on date
    TAG=$(date +%Y.%-m.%-d-work%-H%M)
else
    # determine the tag to use based on date
    TAG=$(date +%Y.%-m.%-d-%-H%M)
fi

ioc_dirs=$(ls -d iocs/*/)

# Update all chart dependencies.
for ioc in ${ioc_dirs}; do helm dependency update $ioc; done

# udate the helm chart versions with the tag
sed -e "s/^version: .*$/version: ${TAG}/g" -e "s/^appVersion: .*$/appVersion: ${TAG}/g" -i iocs/*/Chart.yaml

# push all ioc chart packages to the registry
for ioc in ${ioc_dirs}
do
    for THIS_TAG in latest ${TAG}
    do
        URL="${HELM_REPO}/$(basename $ioc):${THIS_TAG}"
        echo saving ${ioc} to "${URL}" ...
        helm chart save ${ioc} "${URL}"
        echo push to "${URL}" ...
        helm chart push "${URL}"
    done
done

echo Done