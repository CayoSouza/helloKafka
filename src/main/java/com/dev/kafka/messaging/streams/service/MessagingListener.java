package com.dev.kafka.messaging.streams.service;

import com.dev.kafka.messaging.streams.kafka.MessagingStreams;
import com.dev.kafka.messaging.streams.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class MessagingListener {

    @StreamListener(MessagingStreams.IN)
    public void handleMessaging(@Payload Message message) {
        log.info("Message received: {}", message);
    }
}
