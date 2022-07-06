FROM openjdk:18
ARG JAR_FILE=calculoservice.jar
COPY ${JAR_FILE} calculoservicewebapp.jar
ENTRYPOINT [ "java","-jar","/calculoservicewebapp.jar" ]