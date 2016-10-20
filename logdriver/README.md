### Prerequistion

Please install Docker 1.12.0 or later, Docker Compose 1.8.0.
We have 3 containers: apache2 (port 81), nginx (port 82), postgres (port 5432), you can change ports mapping for compatibility with your environment.

### Building

```
docker-compose build
```

### Starting

* start Docker Compose, if you are using Linux, just set FLUENTD_HOST to fluentd, otherwise please set IP of your host machine which docker-compose is running

```
FLUENTD_HOST=10.22.20.179 docker-compose up
```

* open [Fluentd-UI](http://localhost:9292) with your browser
* login Fluentd-UI with username `admin` and password `changeme`
* click 'Setup', then 'Create', then 'Start'
* wait a few minutes, then you can try produce some logs

### Producing logs

* Just use your swiss army knives interacting with apache, nginx or postgres, e.g.

```
curl 'http://localhost:82/invalid_url'
```

* Use Docker Compose interacting with Java

```
\# log4j
docker-compose run java java -cp /usr/local/spiralg/java/target/spiralg-fluentd-test-0.0.0-jar-with-dependencies.jar vn.nal.spiralg.fluentd.Log4j2Main

\# logback
docker-compose run java java -cp /usr/local/spiralg/java/target/spiralg-fluentd-test-0.0.0-jar-with-dependencies.jar vn.nal.spiralg.fluentd.LogbackMain
```
