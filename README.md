Spring Boot Boilerplate with Maven
===================

### Prerequisites
* Maven 3 +
* JDK 7 +

### Run with DEV env config
```
mvn clean spring-boot:run -Pdev -Dspring.profiles.active=dev
```

### Run In Debug Mode
```
mvn clean spring-boot:run -Drun.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005" -Pdev -Dspring.profiles.active=dev
```
