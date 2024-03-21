# Overview

Spring boot camunda starter + benchmarks.

Process is auto deployed from resources (see ./resources/main.bpmn)

Run process: http://localhost:8080/process/main/start

# Benchmarks
See ./load

ab is used:
https://httpd.apache.org/docs/2.4/programs/ab.html

# Camunda
Camunda cockpit:
- http://localhost:8080/camunda/app/cockpit/default/#/login
- admin / admin