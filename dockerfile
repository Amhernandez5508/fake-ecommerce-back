FROM openjdk:17

RUN apt-get install maven

COPY . .

RUN mvn install package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/apiloginforjs-0.0.1-SNAPSHOT.jar"]
