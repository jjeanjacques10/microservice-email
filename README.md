# Microservice Email

Sender email application using microservice architecture.

## Technologies

- Java 11
- Spring Framework
- Postgres
- Docker

## Get Started

Start postgres using [Docker](/docker-compose.yml)

``` shell
docker-compose up -d
```
### Config SMTP (Email)

Edit [application.properties](src/main/resources/application.properties) file:

``` properties
spring.mail.username={{YOUR-EMAIL}}
spring.mail.password={{YOUR-PASSWORD}}
```

## References
- [Michelli Brito - Youtube](https://youtu.be/ZBleZzJf6ro)
- [Baeldung](https://www.baeldung.com/)
- [JavaMailSender](https://www.baeldung.com/spring-email)

---
Developd by Jean Jacques