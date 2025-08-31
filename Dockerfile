FROM openjdk:8-jdk-alpine

# Uygulamanın war dosyasını container içine kopyala
ARG WAR_FILE=target/spring-project-1.0.war
COPY ${WAR_FILE} app.war

# Spring Boot fat war ise yine jar gibi çalıştırabilirsin
ENTRYPOINT ["java","-jar","/app.war"]
