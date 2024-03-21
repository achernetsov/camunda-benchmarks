#!/bin/bash
# https://httpd.apache.org/docs/2.4/programs/ab.html
# usage: ./load PROCESS REQUESTS_N CONCURRENT_REQUESTS_N COMMENT
PROCESS=$1
REQUESTS_N=$2
CONCURRENT_REQUESTS_N=$3
COMMENT=$4
ab -n $REQUESTS_N -c $CONCURRENT_REQUESTS_N localhost:8080/process/${PROCESS}/start > ./reports/${PROCESS}_${REQUESTS_N}_${CONCURRENT_REQUESTS_N}_${COMMENT}.txt