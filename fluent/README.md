
Note that this example may not work as expected in your environment!
In this example, I demo receive logging from Java, or use custom plugins

Please install fluentd 0.12.29, jdk8, maven3

```
gem install fluentd -v "~> 0.12.0" --no-ri --no-rdoc
brew install maven
```

### Building

* Building file `java/target/spiralg-fluentd-test-0.0.0-jar-with-dependencies.jar`
```
cd java
mvn clean package
```

### Starting

* Start fluentd

```
fluentd -c fluent.conf -p plugin-test
```

* Demo Java

```
java -DFLUENTD_HOST=localhost -DFLUENTD_PORT=24224 -jar java/target/spiralg-fluentd-test-0.0.0-jar-with-dependencies.jar
```
