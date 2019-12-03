FROM openjdk:8-jdk-alpine
COPY target/java-docker-1.0.0-SNAPSHOT.jar /tmp/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/tmp/app.jar"]
