# FROM openjdk:17

# RUN apt-get install maven

# COPY . .

# RUN mvn clean package

# EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "target/apiloginforjs-0.0.1-SNAPSHOT.jar"]


FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/target/apiloginforjs-0.0.1-SNAPSHOT.jar backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","backend.jar"]