FROM openjdk:17

COPY . .

RUN mvn clean package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/apiloginforjs-0.0.1-SNAPSHOT.jar"]
