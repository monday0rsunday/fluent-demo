### Introduction

This example mount all application's log directories from container to host directory, then fluentd tail log file from that directory

Note that it isn't ready, it's only worked, so you can see weird thing in Fluentd-UI console

### Prerequistion

Please install Docker 1.12.0 or later, Docker Compose 1.8.0.

We have 3 containers: apache2 (port 81), nginx (port 82), postgres (port 5432), change ports mapping for compatibility with your environment.

### Building

```
docker-compose build
```

### Starting

* start Docker Compose

```
docker-compose up
```

* open [Fluentd-UI](http://localhost:9292) with your browser
* login Fluentd-UI with username `admin` and password `changeme`
* click 'Setup', then 'Create', then 'Start'
* wait a few minutes, then you can try produce some logs

### Producing logs

Just use your swiss army knives for interacting with apache, nginx or postgres, e.g.

```
curl 'http://localhost:82/invalid_url'
```
