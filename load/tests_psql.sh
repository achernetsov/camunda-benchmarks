#!/bin/bash

DB=psql

echo "testing db=${DB}"

rm ./reports/*${DB}*

./load.sh main 100 10 ${DB}_cold
./load.sh main 100 20 ${DB}_hot
./load.sh main 500 40 ${DB}_hot
./load.sh main 500 45 ${DB}_hot
./load.sh main 500 50 ${DB}_hot
./load.sh main 500 60 ${DB}_hot