FROM openjdk:21
COPY ./target/Book.jar Book.jar
CMD ["java","-jar","Book.jar"]