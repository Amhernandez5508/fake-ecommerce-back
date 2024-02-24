FROM openjdk:17

COPY . .

RUN mvn install package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "backend.jar"]
