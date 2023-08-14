FROM openjdk:17-jdk-slim-buster

EXPOSE 8081

ADD build/libs/firstSpringBoot-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]