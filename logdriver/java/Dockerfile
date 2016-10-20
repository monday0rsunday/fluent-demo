FROM maven:3.3.9-jdk-7

VOLUME ["/root/.m2"]

COPY . /usr/local/spiralg/java

WORKDIR /usr/local/spiralg/java

RUN mvn clean package

CMD sleep 3000