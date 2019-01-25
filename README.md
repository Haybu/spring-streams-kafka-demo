# Demo to run Spring Cloud Stream using Kafka binder

1- Download kafka binary from https://kafka.apache.org/downloads

2- Run kafka from the extracted downloaded folder 
```shell
 > bin/zookeeper-server-start.sh config/zookeeper.properties
 > bin/kafka-server-start.sh config/server.properties
```
3- This sample contains self contained source, processor and sink application, run each one in a separate terminal window using
```shell
 > mvn spring-boot:run
```
4- Sink application console is expected to log messages out.
