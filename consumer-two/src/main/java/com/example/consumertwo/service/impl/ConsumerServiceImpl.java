package com.example.consumertwo.service.impl;

import com.example.consumertwo.model.User;
import com.example.consumertwo.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.messaging.MessageHeaders;

import static com.example.consumertwo.utils.Constants.TOPIC_2;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    @KafkaListener(topics = TOPIC_2, groupId = "myGroup", containerFactory = "kafkaListenerContainerFactory")
    public void consume(@Payload User user, @Headers MessageHeaders headers) {
        log.info("Received message: {}, headers: {}", user.toString(), headers);
    }
}
