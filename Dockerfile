FROM openjdk:17

WORKDIR /app

COPY build/libs/*.jar product-service.jar

EXPOSE 8080 8443

CMD ["java", "-jar", "product-service.jar"]