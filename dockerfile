FROM adoptopenjdk/openjdk17:alpine

COPY target/apiloginforjs-0.0.1-SNAPSHOT.jar usr/src/app/backend.jar

WORKDIR usr/src/app

CMD ["java", "-jar", "bakcend.jar"]