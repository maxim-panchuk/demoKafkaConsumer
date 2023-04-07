package com.example.demokafkaconsumer.subscribe;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class MessageListener {

    Logger logger = Logger.getLogger(String.valueOf(this.getClass()));

    @StreamListener(ConsumerChannels.DEMO)
    public void demo(String message) {
        logger.info("Demo: " + message);
    }
}