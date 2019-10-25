package com.dev.kafka.messaging.streams.controller;

import com.dev.kafka.messaging.streams.model.Message;
import com.dev.kafka.messaging.streams.service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingController {
    @Autowired
    private MessagingService messagingService;

    @GetMapping("/sendMessage")
    public Message sendMessage(@RequestParam String text) {
        Message message = Message.builder()
                .text(text)
                .timestamp(System.currentTimeMillis())
                .build();

        return messagingService.sendMessage(message);
    }
}
