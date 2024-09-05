FROM openjdk:22
COPY ./target/Book.jar Book.jar
CMD ["java","-jar","Book.jar"]