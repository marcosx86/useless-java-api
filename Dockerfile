FROM openjdk:8-jre-alpine

# Debian-based
#RUN useradd -U -m -s /bin/false javaman
#USER javaman
USER nobody

ARG JARFILE=build/libs/*.jar
COPY ${JARFILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
