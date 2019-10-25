package com.dev.kafka.messaging.streams.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Define streams that will interact (read and write) with Kafka topics.
 */
public interface MessagingStreams {
    String IN = "messaging-in";
    String OUT = "messaging-out";

    //defining outbound stream to write messages to a Kafka's topic
    @Input(IN)
    SubscribableChannel inboundMessage();

    //defining inbound stream to read messages from a Kafka's topic
    @Output(OUT)
    MessageChannel outboundMessage();
}
