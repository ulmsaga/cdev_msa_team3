FROM openjdk:21-jdk-slim
# FROM openjdk:21-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY target/accounts.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
