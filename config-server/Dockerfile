FROM openjdk:17
LABEL maintainer ="config-server"
EXPOSE 8088
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]
