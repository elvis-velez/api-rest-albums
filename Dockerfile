FROM amazoncorretto:24-jdk
LABEL authors="elbis"
WORKDIR /app
COPY ./target/proyecto-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080

CMD ["java","-jar","./app.jar"]