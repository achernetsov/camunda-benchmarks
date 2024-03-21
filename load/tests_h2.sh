#!/bin/bash

DB=h2

echo "testing db=${DB}"

rm ./reports/*${DB}*

./load.sh main 100 10 ${DB}_cold
./load.sh main 500 40 ${DB}_hot
./load.sh main 1000 100 ${DB}_hot
./load.sh main 10000 500 ${DB}_hot
./load.sh main 10000 1000 ${DB}_hot

./load.sh main 1000 200 ${DB}_hot
./load.sh main 1000 300 ${DB}_hot
./load.sh main 1000 350 ${DB}_hot