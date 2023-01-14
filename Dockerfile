FROM amazoncorretto:11-alpine-jdk
MAINTAINER MF
COPY target/mcfs-0.0.1-SNAPSHOT.jar mcfs-app.jar
ENTRYPOINT ["java","-jar","/mcfs-app.jar"]