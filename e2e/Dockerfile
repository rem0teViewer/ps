FROM openjdk:17

WORKDIR /app

COPY build/libs/*.jar e2e.jar

EXPOSE 8080 8443

CMD ["java", "-jar", "e2e.jar"]