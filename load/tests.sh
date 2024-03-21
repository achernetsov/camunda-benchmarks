#!/bin/bash

rm ./reports/*

./load.sh main 100 10 cold
./load.sh main 500 40 hot