# Overview

Spring boot camunda starter + benchmarks.

Process is auto deployed from resources (see ./resources/main.bpmn)

Run process: http://localhost:8080/process/main/start

Process is just 1 activity, sleeping for 200 ms.

## Profiles
- default profile uses h2 embedded db
- run psql profile using spring-boot maven plugin ```mvn spring-boot:run -Dspring-boot.run.profiles=psql```

For postgres, boot postgres using ```docker-compose up```

# Benchmarks
See ./load

ab is used:
https://httpd.apache.org/docs/2.4/programs/ab.html

## Notes
### Embedded
- degradation is noticeable in the range 300-350 concurrent calls 

### PSQL
- degradation after concurrent calls > hikari max pool (see main_500_60_psql_hot.txt, tested for maximum-pool-size: 40)

# Camunda
Camunda cockpit:
- http://localhost:8080/camunda/app/cockpit/default/#/login
- admin / admin