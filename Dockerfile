FROM openjdk:11
EXPOSE 8099
ADD target/employee-registry-app.jar employee-registry-app.jar
ENTRYPOINT ["java""-jar","/employee-registry-app.jar"]