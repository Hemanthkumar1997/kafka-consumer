package com.kafka.consumer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

@SpringBootApplication
@ComponentScan(basePackages = "com.kafka.consumer")
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(KafkaConsumerApplication.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		application.run();
	}

}
