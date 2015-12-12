#
# Oracle Java 8 Dockerfile
#

# Pull base image.
FROM ubuntu

# Install Java.
RUN \
  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  apt-get update -y                             && \
  apt-get install software-properties-common -y && \
  add-apt-repository ppa:webupd8team/java -y    && \
  apt-get update                                && \
  apt-get install -y oracle-java8-installer     && \
  rm -rf /var/lib/apt/lists/*                   && \
  rm -rf /var/cache/oracle-jdk8-installer


# Define working directory.
WORKDIR /opt

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

#exponer puerto
EXPOSE 4567

#add del jar
COPY target/bdd-dojo-1.0.0-jar-with-dependencies.jar .

#Cmd de ejecucion
ENTRYPOINT ["java", "-jar", "bdd-dojo-1.0.0-jar-with-dependencies.jar"]

#build y ejecucion
#docker build -t harryPotter
#docker run -t -p 4567:4567 harryPotter
