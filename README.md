# Spring Boot Car Producer Project

This is a sample Java / Maven / Spring Boot application. I hope it helps you.

### Used Technologies, Library and Patterns
* Spring Boot 2.3.5.RELEASE
* Java 1.8
* Maven
* Swagger
* Factory Design Pattern

### How to Run 

This application is packaged as a war which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the ```java -jar``` command.

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package``` and ```mvn install package```


### How to test
http://localhost:8080/api/car/{carType}   --carType is a path variable. It can be sedan or cabrio
```
Get /api/car/{carType}
Accept: application/json
Content-Type: application/json

RESPONSE: HTTP 200 ok

```

### For test api by using Swagger-Ui

Run this project by this command : ```mvn clean spring-boot:run```

Open your browser :

http://localhost:8080/swagger-ui.html

and test it on Swagger-ui.




