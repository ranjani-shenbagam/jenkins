FROM openjdk:11
EXPOSE 8085
ADD target/restaurant-project1.jar restaurant-project1.jar
ENTRYPOINT ["java","-jar","restaurant-project1.jar"]