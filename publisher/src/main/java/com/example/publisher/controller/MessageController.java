package com.example.publisher.controller;

import com.example.publisher.model.User;
import com.example.publisher.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private ProducerService<User> producerService;

    // http://localhost:8080/api/publishMessage?message=hello
    @PostMapping("/publishMessage")
    public String publishMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent";
    }

    // http://localhost:8080/api/publishUser
    @PostMapping("/publishUser")
    public String publishUser(@RequestBody User message) {
        producerService.sendUser(message);
        return "Message sent";
    }
}
