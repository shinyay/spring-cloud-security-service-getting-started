FROM adoptopenjdk:8u212-b04-jre-hotspot-bionic
COPY /build/libs/spring-cloud-security-service-gs-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
EXPOSE 9000
