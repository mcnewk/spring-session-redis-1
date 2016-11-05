FROM openjdk:latest

RUN apt-get update -y && apt-get install netcat -y

COPY ./target/redis-session-test.jar /

EXPOSE 8081

CMD wait 30; java -jar /redis-session-test.jar
