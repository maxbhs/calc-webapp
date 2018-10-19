FROM openjdk:8-jdk-alpine
ADD target/calculator-web-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
CMD ["java", "-jar", "calculator-web-0.0.1-SNAPSHOT.jar"]
