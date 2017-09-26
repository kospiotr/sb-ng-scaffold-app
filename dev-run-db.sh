cd src/main/docker/db && \
docker build . -t mysql-with-sample-data && \
docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_ALLOW_EMPTY_PASSWORD=true mysql-with-sample-data