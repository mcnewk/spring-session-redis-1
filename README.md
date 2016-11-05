# spring-session-redis-1

This example is based off https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-session-redis

This is a simple spring boot application that uses spring-rest-data-redis to store a simple greeting within session backed by redis. Spiped is also used to encrypt traffic to and from the redis instance.  This projects expects a simple docker redis instance up and running on port 6379. Nginx is used as a reverse proxy to the three tier'ed application.

To build the docker images with docker-compose
```
REDIS_HOST_ADDR="spipedEncrypt" REDIS_PORT="16000" SERVER_PORT="8081" docker-compose -p redis-sessions build
```

To startup the services with docker-compose
```
REDIS_HOST_ADDR="spipedEncrypt" REDIS_PORT="16000" SERVER_PORT="8081" docker-compose -p redis-sessions up -d
```

To stop and remove the services with docker-compose
```
REDIS_HOST_ADDR="spipedEncrypt" REDIS_PORT="16000" SERVER_PORT="8081" docker-compose -p redis-sessions down
```
