# Image with gradle on alpine, mark as build
FROM gradle:7.5.1-jdk11-alpine AS build
# Copy in contaier files
COPY --chown=gradle:gradle . /home/gradle/src
# Working directory for new instruction
WORKDIR /home/gradle/src
# Run and add new slice
RUN gradle build

# Image with jre
FROM openjdk:11-jre-slim
# Create new directory for jar
RUN mkdir /app
# Move jar to directory
COPY --from=build /home/gradle/src/build/libs/converter-1.0.jar /app/app.jar
# Run application
ENTRYPOINT ["java","-jar","/app/app.jar"]