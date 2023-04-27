FROM gradle:8.1.1-jdk17-alpine as build
COPY . .
RUN gradle bootJar

FROM eclipse-temurin:17
WORKDIR app
COPY --from=build ./build/libs/springk8s-0.0.1-SNAPSHOT.jar ./
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springk8s-0.0.1-SNAPSHOT.jar"]
