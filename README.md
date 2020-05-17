# CRUD_Docker
Implements Micro-services in Jersey web application for CRUD operations on MySql database in RESTful  manner

# Usage
Build image of `manojpopalghat/CRUD_Docker` by clone or download Repository ang go to this directory
and use following shell script
```shell
docker build -t manojpopalghat/CRUD_Docker .
```

# Running your manojpopalghat/CRUD_Docker docker image
use following shell script
```shell
docker run -d -p 8080:8080 -p 3306:3306 manojpopalghat/CRUD_Docker
```
```shell
docker run -d -p 8080:8080 -p 3306:3306 --name=manojpopalghat/crudapi_docker <container-id>
```
 
