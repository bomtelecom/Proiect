#!/usr/bin/env sh
mvn clean spring-boot:run -Drun.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005" -Pdev -Dspring.profiles.active=dev