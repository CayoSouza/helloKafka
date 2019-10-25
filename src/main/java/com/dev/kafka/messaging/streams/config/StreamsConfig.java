package com.dev.kafka.messaging.streams.config;

import com.dev.kafka.messaging.streams.kafka.MessagingStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessagingStreams.class)
/**
 * Binds streams into MessagingStreams interface.
 */
public class StreamsConfig {
}
