docker build --platform linux/amd64 -t spring-helloworld .
docker run -p 8099:8099 -t spring-helloworld

docker build --platform linux/amd64 -t spring-helloworld . && docker run -p 8939:8939 -t spring-helloworld
