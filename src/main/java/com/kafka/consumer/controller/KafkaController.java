package com.kafka.consumer.controller;

import com.kafka.consumer.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaController {

    private static final String TOPIC = "Student_Info";

    @KafkaListener(topics = TOPIC)
    public void consumeFromKafka(Student student) {
        logger.info("Reading from Kafka {}", student);
    }
}
