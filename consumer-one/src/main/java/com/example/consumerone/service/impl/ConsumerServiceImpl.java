package com.example.consumerone.service.impl;

import com.example.consumerone.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    @KafkaListener(topics = "Topic1", groupId = "myGroup", containerFactory = "kafkaListenerStringFactory")
    public void consume(String message) {
        log.info("Received Message : " + message);
    }

}
