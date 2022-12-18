FROM openjdk
WORKDIR /app
ARG JAR_FILE
COPY target/${JAR_FILE} /app/core-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "core-service.jar"]