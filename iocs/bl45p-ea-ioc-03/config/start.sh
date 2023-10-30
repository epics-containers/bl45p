#!/bin/bash

# Create the OPI directory
mkdir -p /epics/opi
# Start the Panda soft IOC application
pandablocks-ioc softioc bl45p-mo-panda-01 BL45P-EA-IOC-03 --clear-bobfiles --screens-dir /epics/opi

