FROM openjdk:17-jdk-slim

COPY target/UILab2-0.0.1-SNAPSHOT.jar ui-service.jar

EXPOSE 9031

ENTRYPOINT ["java", "-jar", "/ui-service.jar"]
