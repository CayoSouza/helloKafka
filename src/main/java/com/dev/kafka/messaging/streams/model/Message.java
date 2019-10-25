package com.dev.kafka.messaging.streams.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter @Setter
public class Message {
    private String text;
    private long timestamp;
    private boolean success;
}
