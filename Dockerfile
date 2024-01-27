# Stage 1: Build the JAR file
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app

# Copy the source code
COPY ./src ./src
COPY ./pom.xml .

# Build the JAR file
RUN mvn clean package

# Stage 2: Create the final image
FROM openjdk:17-jdk-alpine
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/EMS-0.0.1-SNAPSHOT.jar .

# Specify the command to run your application
CMD ["java", "-jar", "EMS-0.0.1-SNAPSHOT.jar"]
