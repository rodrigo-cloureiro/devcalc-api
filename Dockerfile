FROM maven:3.9.11-eclipse-temurin-21-alpine AS build

WORKDIR /app
COPY . .

RUN mvn clean package

#FROM amazoncorretto:25-alpine3.20
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY --from=build /app/target/devcalc-api-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

# Sem multistage build
#FROM maven:3.9.11-eclipse-temurin-21-alpine
#LABEL authors="rodrigoloureiro"
#
#WORKDIR /app
#COPY . .
#
#EXPOSE 8080
#
#RUN mvn clean package -DskipTests
#CMD ["java", "-jar", "target/devcalc-api-0.0.1-SNAPSHOT.jar"]