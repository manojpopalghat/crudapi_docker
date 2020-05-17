mysql -uadmin -padmin00 -e 'CREATE DATABASE userDB CHARACTER SET UTF8'
mysql -uadmin -padmin00 -e 'CREATE TABLE userDB.users (id int PRIMARY KEY AUTO_INCREMENT,name varchar(100),age int,department varchar(50),subject varchar(200))'
mysql -uadmin -padmin00 -e "INSERT INTO userDB.users VALUES (111,'manoj',24,'Mathematics','devOps'),(112,'harshal',22,'Maths','ML,Data-Science'),(113,'ankita',23,'Maths','ML'),(114,'Lalit',23,'Maths','Data_Science,ML'),(115,'aniket',23,'Computer Science','IoT'),(116,'vikas',24,'Maths','Computational Geometry,System Programming,Cryptography')"
