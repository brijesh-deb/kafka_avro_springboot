package com.kafka.sample.consumer.sampleKafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import example.avro.User;

import java.util.concurrent.CountDownLatch;

public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @KafkaListener(topics = "patient-data")
    public void receive(User user) {
        LOGGER.info("received user='{}'", user.toString());
        latch.countDown();
    }
}
