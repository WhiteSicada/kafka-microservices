package com.example.publisher.service;

public interface ProducerService<T> {
    void sendMessage(String message);
    void sendUser(T message);
}
