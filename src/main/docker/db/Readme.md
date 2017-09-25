Use it by building it:
docker build . -t mysql-with-sample-data

And running it:
docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_ALLOW_EMPTY_PASSWORD=true mysql-with-sample-data
