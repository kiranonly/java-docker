# Build stage
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# package state
FROM openjdk:8-jdk-alpine
COPY --from=build /home/app/target/java-docker-1.0.0-SNAPSHOT.jar /tmp/app.jar
#COPY target/java-docker-1.0.0-SNAPSHOT.jar /tmp/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/tmp/app.jar"]
