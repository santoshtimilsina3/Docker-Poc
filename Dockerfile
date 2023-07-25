FROM openjdk:17 as build
WORKDIR /app
COPY mvnw mvnw
COPY .mvn .mvn
COPY src src
COPY pom.xml pom.xml
RUN ./mvnw package -Dmaven.test.skip=true

FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/maven-docker-0.0.1-SNAPSHOT.jar ./santosh.jar
ENTRYPOINT ["java","-jar","./santosh.jar"]

