FROM openjdk:17-jdk-slim
   WORKDIR /app
   COPY target/spring-ci-cd-0.0.1-SNAPSHOT.jar /app/spring-ci-cd.jar
   ENTRYPOINT ["java", "-jar", "spring-ci-cd.jar"]
   EXPOSE 8080