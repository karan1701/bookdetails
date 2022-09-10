FROM openjdk:8
EXPOSE 9092
ADD target/bookdetails.jar bookdetails.jar
ENTRYPOINT ["java", "-jar", "/bookdetails.jar"]