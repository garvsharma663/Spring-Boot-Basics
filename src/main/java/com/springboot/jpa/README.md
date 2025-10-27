Up until now, our data only lived in the memory, which means when the app is closed, the data was gone too.
So, in order to persist the data, we'll use JPA (Java Persistence API)
Add this dependency in pom.xml


<dependency>
    <groupId>org.springframework.boot</groupId>

    <artifactId>spring-boot-starter-data-jpa</artifactId>

</dependency>

<dependency>

    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>

</dependency>

AND also add this is application.properties
spring.datasource.url=jdbc:h2:mem:moviedb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
