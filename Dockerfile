FROM eclipse-temurin:17 
COPY target/lmstask.jar lms.jar
CMD ["java","-jar","lms.jar"]