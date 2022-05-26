package com.vitorgsevero.javaspringbootkafka.controller;

import com.vitorgsevero.javaspringbootkafka.model.SimpleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaTemplate<String, SimpleModel> kafkaTemplate;

    @Autowired
    public KafkaController(KafkaTemplate<String, SimpleModel> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void create(@RequestBody SimpleModel simpleModel) {
        kafkaTemplate.send("myTopic", simpleModel);
    }

}
