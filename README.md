# Microservice Email

Sender email application using microservice architecture.

## Technologies

- Java 11
- Spring Framework
- Postgres
- Docker
- RabbitMQ

## Get Started

Start postgres using [Docker](/docker-compose.yml)

``` shell
docker-compose up -d
```
### Config SMTP (Email)

Edit [application.properties](src/main/resources/application.properties) file

``` properties
spring.mail.username={{YOUR-EMAIL}}
spring.mail.password={{YOUR-PASSWORD}}
```

Create a RabbitMQ project in [CloudAMQP](cloudamqp.com) or use other message tool instance

``` properties
spring.rabbitmq.addresses={{YOUR-URL}}
spring.rabbitmq.queue=ms.email
```

## References
- [Michelli Brito - Youtube](https://youtu.be/ZBleZzJf6ro)
- [Baeldung](https://www.baeldung.com/)
- [JavaMailSender](https://www.baeldung.com/spring-email)

---
Developd by Jean Jacques