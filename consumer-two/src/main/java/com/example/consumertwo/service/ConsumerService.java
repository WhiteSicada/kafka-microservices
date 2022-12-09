package com.example.consumertwo.service;

import com.example.consumertwo.model.User;
import org.springframework.messaging.MessageHeaders;

public interface ConsumerService {
    void consume(User user, MessageHeaders headers);
}
