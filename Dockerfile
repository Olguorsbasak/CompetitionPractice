FROM amazoncorretto:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
CMD apt-get update -y
CMD ping -c 5 localhost:5432
ENTRYPOINT ["java","-jar","/application.jar"]