package com.dev.kafka.messaging.streams.service;

import com.dev.kafka.messaging.streams.kafka.MessagingStreams;
import com.dev.kafka.messaging.streams.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Slf4j
@Service
public class MessagingService {
    @Autowired
    private MessagingStreams messagingStreams;

    public Message sendMessage(final Message message) {
        log.info("Sending message: {}", message);

        MessageChannel messageChannel = messagingStreams.outboundMessage();
        boolean sent = messageChannel.send(MessageBuilder.withPayload(message)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());

        return Message.builder()
                .success(sent)
                .text(message.getText())
                .timestamp(System.currentTimeMillis())
                .build();
    }
}
