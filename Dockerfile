FROM openjdk:11-jdk
ARG JAR_FILE=build/libs/*.jar
ARG DEPENDENCY=build/libs/dependency
COPY ${JAR_FILE} /app/main.jar
COPY ${DEPENDENCY} /app/libs
ENTRYPOINT ["java","-cp","/app/*:/app/libs/*","org.sengarkuldeep.Main"]