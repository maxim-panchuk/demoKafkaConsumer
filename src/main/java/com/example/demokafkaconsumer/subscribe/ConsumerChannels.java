package com.example.demokafkaconsumer.subscribe;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerChannels {
    String DEMO = "demo";

    @Input(DEMO)
    SubscribableChannel demo();
}
