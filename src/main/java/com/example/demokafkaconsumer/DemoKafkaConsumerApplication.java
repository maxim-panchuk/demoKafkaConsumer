package com.example.demokafkaconsumer;

import com.example.demokafkaconsumer.subscribe.ConsumerChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ConsumerChannels.class)
public class DemoKafkaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoKafkaConsumerApplication.class, args);
    }
}
