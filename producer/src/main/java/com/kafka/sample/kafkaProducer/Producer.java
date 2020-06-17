package com.kafka.sample.kafkaProducer;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import example.avro.User;

@Service
public class Producer 
{
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "patient-data";

    @Autowired
    //private KafkaTemplate<String, String> kafkaTemplate;
    private KafkaTemplate<String, User> kafkaTemplate;          // Use this for Avro

    /*
    // Send Simple message
    public void sendMessage1(String message) {
        logger.info(String.format("Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }

    // Send message using ProducerRecord
    public void sendMessage2(String message) {
        logger.info(String.format("Producing message -> %s", message));
        ProducerRecord<String,String> producerRecord = new ProducerRecord<>(TOPIC,0,"111",message);
        this.kafkaTemplate.send(producerRecord);
    }

    // Send message using Message
    public void sendMessage3(String message)
    {
        logger.info(String.format("Producing message -> %s", message));
        Message<String> msg = MessageBuilder
                .withPayload(message)
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .setHeader(KafkaHeaders.MESSAGE_KEY, "111")
                .setHeader(KafkaHeaders.PARTITION_ID, 0)
                .setHeader("X-Custom-Header", "Sending Custom Header with Spring Kafka")
                .build();

        kafkaTemplate.send(msg);
    }
    // Send message with TimeStamp
    public void sendMessage4(String message) {
        logger.info(String.format("Producing message -> %s", message));
        ProducerRecord<String,String> producerRecord = new ProducerRecord<>(TOPIC,0,null,"111",message);
        this.kafkaTemplate.send(producerRecord);
    }

    // Send message Asynchronously using Future
    public void sendMessage5(String message) {
        logger.info(String.format("Producing message -> %s", message));
        ProducerRecord<String,String> producerRecord = new ProducerRecord<>(TOPIC,0,null,"111",message);

        ListenableFuture<SendResult<String, String>> future =  kafkaTemplate.send(producerRecord);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>()
        {
            @Override
            public void onSuccess(SendResult<String, String> result)
            {
                logger.info("Inside onSuccess");
                logger.info("Successfully Sent message=[" + message +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                logger.info("Unable to send message=["
                        + message + "] due to : " + ex.getMessage());
            }
        });
    }

    // Send message synchronously
    public void sendMessage6(String message) {
        logger.info(String.format("Producing message -> %s", message));
        ProducerRecord<String,String> producerRecord = new ProducerRecord<>(TOPIC,0,null,"111",message);

        try
        {
            SendResult<String, String> result =  kafkaTemplate.send(producerRecord).get();
            logger.info("Message send; offset: "+result.getRecordMetadata().offset());
        }
        catch(Exception ex)
        {
            logger.info(ex.getMessage());
        }
    }

    */

    //Show usage of Avro for serialization
    public void sendAvroMessage7()
    {
        logger.info(String.format("Producing message -> Send Avro Message"));
        User user = new User("Brijesh",10,"White");
        ProducerRecord<String,User> producerRecord = new ProducerRecord<>(TOPIC,0,null,"111",user);
        this.kafkaTemplate.send(TOPIC, user);
    }

}