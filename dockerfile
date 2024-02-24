FROM adoptopenjdk/openjdk17:alpine

RUN mvn install package

COPY target/apiloginforjs-0.0.1-SNAPSHOT.jar usr/src/app/backend.jar

WORKDIR usr/src/app

CMD ["java", "-jar", "backend.jar"]