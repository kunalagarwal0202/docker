FROM openjdk:15-jdk-alpine
EXPOSE 8080
ADD target/awsDocker-0.0.1-SNAPSHOT.jar awsDocker.jar
ENTRYPOINT ["java", "-jar", "/awsDocker.jar"]
