# crudapi_docker
Implements Micro-services in Jersey web application for CRUD operations on MySql database in RESTful  manner

# Usage
Build image of `manojpopalghat/crudapi_docker` by clone or download Repository ang go to this directory
and use following shell script
```shell
docker build -t manojpopalghat/crudapi_docker .
```

# Running your manojpopalghat/CRUD_Docker docker image
use following shell script
```shell
docker run -d -p 8080:8080 -p 3306:3306 <image-id>
```
```shell
docker run -d -p 8080:8080 -p 3306:3306 --name=crudapi <container-id>
```
# Explore the Container crudapi
use following shell script
```shell
docker exec -it crudapi bash
```
# Test Your Deployment
http://localhost:8080/CRUD/
