package com.example.sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SinkApplication {

	Logger log = LoggerFactory.getLogger(SinkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SinkApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void handle(String msg) {
		log.info(msg);
	}

}

