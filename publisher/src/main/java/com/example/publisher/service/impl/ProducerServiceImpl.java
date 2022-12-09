package com.example.publisher.service.impl;

import com.example.publisher.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.example.publisher.utils.Constants.TOPIC_1;
import static com.example.publisher.utils.Constants.TOPIC_2;

@Slf4j
@Service
public class ProducerServiceImpl<T> implements ProducerService<T> {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, T> kafkaTemplateJson;

    @Override
    public void sendMessage(String message) {
        log.info("#### -> Publishing message -> {}", message);
        kafkaTemplate.send(TOPIC_1, message);
    }

    @Override
    public void sendUser(T object) {
        log.info("#### -> Publishing message -> {}", object);
        kafkaTemplateJson.send(TOPIC_2, object);
    }
}
