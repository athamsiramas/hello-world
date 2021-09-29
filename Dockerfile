FROM openjdk:11-jdk
VOLUME /tmp
ADD target/hello-world-${SERVICE_VERSION}.jar hello-world.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /hello-world.jar" ]
