FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/EMS-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]