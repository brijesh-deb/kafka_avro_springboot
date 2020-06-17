package com.kafka.sample.kafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class Controller {

    private final Producer producer;

    @Autowired
    public Controller(Producer producer)
    {
        this.producer = producer;
    }

    /* Comment this section while trying Avro usage
    @PostMapping(value = "/publish1")
    public void sendMessage1(@RequestParam("message") String message)
    {
        this.producer.sendMessage1(message);
    }

    @PostMapping(value = "/publish2")
    public void sendMessage2(@RequestParam("message") String message)
    {
        this.producer.sendMessage2(message);
    }

    @PostMapping(value = "/publish3")
    public void sendMessage3(@RequestParam("message") String message)
    {
        this.producer.sendMessage3(message);
    }

    @PostMapping(value = "/publish4")
    public void sendMessage4(@RequestParam("message") String message)
    {
        this.producer.sendMessage4(message);
    }

    @PostMapping(value = "/publish5")
    public void sendMessage5(@RequestParam("message") String message)
    {
        this.producer.sendMessage5(message);
    }

    @PostMapping(value = "/publish6")
    public void sendMessage6(@RequestParam("message") String message)
    {
        this.producer.sendMessage6(message);
    }

    */

    // This shows the usage of Avro for serialization
    @PostMapping(value = "/publish7")
    public void sendAvroMessage7()
    {
        this.producer.sendAvroMessage7();
    }
}