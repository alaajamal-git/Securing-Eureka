# Securing-Eureka

in this project we configured eureka server to be more secure.

configuration:
1. add dependency "spring-boot-starter-security" to eureka pom.xml
2. add WebSecurity class and @EnableWebSecurity.
3. add two properties for eureka server :'spring.security.user.name' and 'spring.security.user.password' which will be use by admin and microservices to connect to eureka server.
4. to make our properties more secure we encrypt the password properties and make it available on configserver.

To connect a microservice to eureka we have then to use the url: "http://test:test@localhost:8010/eureka"
in our project we encrypt the password so we used the url: "http://test:${eureka.pass}@localhost:8010/eureka"
${eureka.pass} is the property in which we stored the encrypted value of the password 'test'.
