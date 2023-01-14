FROM amazoncorretto:11-alpine-jdk
MAINTAINER MF
COPY target/mcfs-0.0.1-SNAPSHOT.jar mcfs-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mcfs-0.0.1-SNAPSHOT.jar"]