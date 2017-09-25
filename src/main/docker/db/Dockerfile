FROM mysql:latest
RUN apt-get update \
    && apt-get install -y wget unzip \
    && wget -O /docker-entrypoint-initdb.d/master.zip "https://github.com/datacharmer/test_db/archive/master.zip" \
    && unzip /docker-entrypoint-initdb.d/master.zip -d /docker-entrypoint-initdb.d \
    && ls /docker-entrypoint-initdb.d \
    && mv /docker-entrypoint-initdb.d/test_db-master/sakila/*.* /docker-entrypoint-initdb.d \
    && mv /docker-entrypoint-initdb.d/sakila-mv-schema.sql /docker-entrypoint-initdb.d/_sakila-mv-schema.sql \
    && chmod 777 /docker-entrypoint-initdb.d/*.* \
    && ls /docker-entrypoint-initdb.d -alt
