FROM openjdk:8-jdk-alpine
ADD target/catalog-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]