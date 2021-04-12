# This file was automatically generated on Mon 12 Apr 2021 10:33:57 BST from
# source: /scratch/work/bl45p-builder/etc/makeIocs/BL45P-EA-IOC-01.xml
#
# *** Please do not edit this file: edit the source file instead. ***
#
cd $(TOP)

epicsEnvSet "EPICS_CA_MAX_ARRAY_BYTES", '6000000'
epicsEnvSet "EPICS_TS_MIN_WEST", '0'


# Loading libraries
# -----------------

# Device initialisation
# ---------------------

cd $(TOP)

dbLoadDatabase "dbd/ioc.dbd"
ioc_registerRecordDeviceDriver(pdbbase)

aravisConfig("DET.DET", "172.23.59.11", -1, 0, 1)

aravisConfig("DIFF.DET", "172.23.59.12", -1, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DET.roi", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DET.rois.roi1", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DET.rois.roi2", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DET.rois.roi3", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DET.rois.roi4", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DET.rois.roi5", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DET.rois.roi6", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)

# ADCore path for manual NDTimeSeries.template to find base plugin template
epicsEnvSet "EPICS_DB_INCLUDE_PATH", "$(ADCORE)/db"

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DET.stat", 16, 0, "DET.DET", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DET.stat_TS", 16, 0, "DET.stat", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-MAP-01,R=:STAT:TS:, PORT=DET.stat_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DET.stat,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DET.stats.stat1", 16, 0, "DET.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DET.stats.stat1_TS", 16, 0, "DET.stats.stat1", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-MAP-01,R=:STAT1:TS:, PORT=DET.stats.stat1_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DET.stats.stat1,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DET.stats.stat2", 16, 0, "DET.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DET.stats.stat2_TS", 16, 0, "DET.stats.stat2", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-MAP-01,R=:STAT2:TS:, PORT=DET.stats.stat2_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DET.stats.stat2,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DET.stats.stat3", 16, 0, "DET.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DET.stats.stat3_TS", 16, 0, "DET.stats.stat3", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-MAP-01,R=:STAT3:TS:, PORT=DET.stats.stat3_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DET.stats.stat3,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DET.stats.stat4", 16, 0, "DET.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DET.stats.stat4_TS", 16, 0, "DET.stats.stat4", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-MAP-01,R=:STAT4:TS:, PORT=DET.stats.stat4_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DET.stats.stat4,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DET.stats.stat5", 16, 0, "DET.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DET.stats.stat5_TS", 16, 0, "DET.stats.stat5", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-MAP-01,R=:STAT5:TS:, PORT=DET.stats.stat5_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DET.stats.stat5,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DET.stats.stat6", 16, 0, "DET.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DET.stats.stat6_TS", 16, 0, "DET.stats.stat6", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-MAP-01,R=:STAT6:TS:, PORT=DET.stats.stat6_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DET.stats.stat6,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStdArraysConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStdArraysConfigure("DET.arr", 2, 0, "DET.roi", 0, 0, 0, 0, 0, 1)

# NDProcessConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr)
NDProcessConfigure("DET.proc", 16, 0, "DET.DET", 0)

# NDOverlayConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, NOverlays, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDOverlayConfigure("DET.over", 16, 0, "DET.proc", 0, 8, 0, 0, 0, 0, 1)

# ffmpegFileConfigure(portName,  queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory)
ffmpegFileConfigure  ("DET.fimg", 16, 0, "DET.DET", 0, 50, 0)

# NDFileTIFFConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr)
NDFileTIFFConfigure("DET.tiff", 16, 0, "DET.DET", 0)

# NDFileHDF5Configure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr)
NDFileHDF5Configure("DET.hdf", 16, 0, "DET.DET", 0)

ffmpegServerConfigure(8080)
# ffmpegStreamConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxMemory)
ffmpegStreamConfigure("DET.mjpg", 2, 0, "DET.over", "0", 0)

# NDPvaConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, pvName, maxBuffers, maxMemory, priority, stackSize)
NDPvaConfigure("DET.pva", 16, 0, "DET.DET", 0, BL45P-EA-MAP-01:PVA:ARRAY, 0, 0, 0, 0)
startPVAServer

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DIFF.roi", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DIFF.rois.roi1", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DIFF.rois.roi2", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DIFF.rois.roi3", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DIFF.rois.roi4", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DIFF.rois.roi5", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)

# NDROIConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDROIConfigure("DIFF.rois.roi6", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DIFF.stat", 16, 0, "DIFF.DET", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DIFF.stat_TS", 16, 0, "DIFF.stat", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-DIFF-01,R=:STAT:TS:, PORT=DIFF.stat_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DIFF.stat,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DIFF.stats.stat1", 16, 0, "DIFF.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DIFF.stats.stat1_TS", 16, 0, "DIFF.stats.stat1", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-DIFF-01,R=:STAT1:TS:, PORT=DIFF.stats.stat1_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DIFF.stats.stat1,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DIFF.stats.stat2", 16, 0, "DIFF.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DIFF.stats.stat2_TS", 16, 0, "DIFF.stats.stat2", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-DIFF-01,R=:STAT2:TS:, PORT=DIFF.stats.stat2_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DIFF.stats.stat2,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DIFF.stats.stat3", 16, 0, "DIFF.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DIFF.stats.stat3_TS", 16, 0, "DIFF.stats.stat3", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-DIFF-01,R=:STAT3:TS:, PORT=DIFF.stats.stat3_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DIFF.stats.stat3,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DIFF.stats.stat4", 16, 0, "DIFF.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DIFF.stats.stat4_TS", 16, 0, "DIFF.stats.stat4", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-DIFF-01,R=:STAT4:TS:, PORT=DIFF.stats.stat4_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DIFF.stats.stat4,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DIFF.stats.stat5", 16, 0, "DIFF.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DIFF.stats.stat5_TS", 16, 0, "DIFF.stats.stat5", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-DIFF-01,R=:STAT5:TS:, PORT=DIFF.stats.stat5_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DIFF.stats.stat5,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStatsConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStatsConfigure("DIFF.stats.stat6", 16, 0, "DIFF.rois.roi1", 0, 0, 0, 0, 0, 1)
# NDTimeSeriesConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxSignals)
NDTimeSeriesConfigure("DIFF.stats.stat6_TS", 16, 0, "DIFF.stats.stat6", 1, 23)
# Load time series records
dbLoadRecords("$(ADCORE)/db/NDTimeSeries.template",  "P=BL45P-EA-DIFF-01,R=:STAT6:TS:, PORT=DIFF.stats.stat6_TS ,ADDR=0,TIMEOUT=1,NDARRAY_PORT=DIFF.stats.stat6,NDARRAY_ADDR=1,NCHANS=1024,ENABLED=1")

# NDStdArraysConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDStdArraysConfigure("DIFF.arr", 2, 0, "DIFF.roi", 0, 0, 0, 0, 0, 1)

# NDProcessConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr)
NDProcessConfigure("DIFF.proc", 16, 0, "DIFF.DET", 0)

# NDOverlayConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, NOverlays, maxBuffers, maxMemory, priority, stackSize, maxThreads)
NDOverlayConfigure("DIFF.over", 16, 0, "DIFF.proc", 0, 8, 0, 0, 0, 0, 1)

# ffmpegFileConfigure(portName,  queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory)
ffmpegFileConfigure  ("DIFF.fimg", 16, 0, "DIFF.DET", 0, 50, 0)

# NDFileTIFFConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr)
NDFileTIFFConfigure("DIFF.tiff", 16, 0, "DIFF.DET", 0)

# NDFileHDF5Configure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr)
NDFileHDF5Configure("DIFF.hdf", 16, 0, "DIFF.DET", 0)

# ffmpegStreamConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxMemory)
ffmpegStreamConfigure("DIFF.mjpg", 2, 0, "DIFF.over", "0", 0)

# NDPvaConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, pvName, maxBuffers, maxMemory, priority, stackSize)
NDPvaConfigure("DIFF.pva", 16, 0, "DIFF.DET", 0, BL45P-EA-DIFF-01:PVA:ARRAY, 0, 0, 0, 0)
startPVAServer

# NDPosPluginConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize)
NDPosPluginConfigure("DET.POS", 1000, 0, "DET.DET", 0, 0, 0, 0, 0)

# NDPosPluginConfigure(portName, queueSize, blockingCallbacks, NDArrayPort, NDArrayAddr, maxBuffers, maxMemory, priority, stackSize)
NDPosPluginConfigure("DIFF.POS", 1000, 0, "DIFF.DET", 0, 0, 0, 0, 0)

# Final ioc initialisation
# ------------------------
cd $(TOP)
dbLoadRecords $(THIS_DIR)/BL45P-EA-IOC-01_expanded.db
dbLoadRecords $(THIS_DIR)/BL45P-EA-IOC-01.db

# Extra IOC commands
callbackSetQueueSize(10000)

iocInit

# Extra post-init IOC commands
dbpf "BL45P-EA-MAP-01:FIMG:FileTemplate", "%s/%s_%d.avi"
dbpf "BL45P-EA-MAP-01:HDF5:FileTemplate", "%s/%s_%d.h5"
dbpf "BL45P-EA-DIFF-01:FIMG:FileTemplate", "%s/%s_%d.avi"
dbpf "BL45P-EA-DIFF-01:HDF5:FileTemplate", "%s/%s_%d.h5"


dbpf BL45P-EA-DIFF-01:STAT:NDAttributesFile, BL45P-EA-IOC-01App/data/DIFF.stat.xml
dbpf BL45P-EA-MAP-01:STAT6:NDAttributesFile, BL45P-EA-IOC-01App/data/DET.stats.stat6.xml
dbpf BL45P-EA-MAP-01:STAT:NDAttributesFile, BL45P-EA-IOC-01App/data/DET.stat.xml
dbpf BL45P-EA-MAP-01:STAT5:NDAttributesFile, BL45P-EA-IOC-01App/data/DET.stats.stat5.xml
dbpf BL45P-EA-MAP-01:STAT4:NDAttributesFile, BL45P-EA-IOC-01App/data/DET.stats.stat4.xml
dbpf BL45P-EA-MAP-01:STAT3:NDAttributesFile, BL45P-EA-IOC-01App/data/DET.stats.stat3.xml
dbpf BL45P-EA-MAP-01:STAT2:NDAttributesFile, BL45P-EA-IOC-01App/data/DET.stats.stat2.xml
dbpf BL45P-EA-MAP-01:STAT1:NDAttributesFile, BL45P-EA-IOC-01App/data/DET.stats.stat1.xml
dbpf BL45P-EA-DIFF-01:STAT2:NDAttributesFile, BL45P-EA-IOC-01App/data/DIFF.stats.stat2.xml
dbpf BL45P-EA-DIFF-01:STAT3:NDAttributesFile, BL45P-EA-IOC-01App/data/DIFF.stats.stat3.xml
dbpf BL45P-EA-DIFF-01:STAT1:NDAttributesFile, BL45P-EA-IOC-01App/data/DIFF.stats.stat1.xml
dbpf BL45P-EA-DIFF-01:STAT6:NDAttributesFile, BL45P-EA-IOC-01App/data/DIFF.stats.stat6.xml
dbpf BL45P-EA-DIFF-01:STAT4:NDAttributesFile, BL45P-EA-IOC-01App/data/DIFF.stats.stat4.xml
dbpf BL45P-EA-DIFF-01:STAT5:NDAttributesFile, BL45P-EA-IOC-01App/data/DIFF.stats.stat5.xml









































































































































































































































































