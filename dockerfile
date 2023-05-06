FROM amazoncorretto:8
MAINTAINER tpfinal_fr
COPY target/fr-0.0.1-SNAPSHOT.jar fr-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fr-0.0.1-SNAPSHOT.jar"]
