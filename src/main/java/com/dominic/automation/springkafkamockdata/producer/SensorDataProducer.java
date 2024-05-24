package com.dominic.automation.springkafkamockdata.producer;


import com.dominic.automation.springkafkamockdata.model.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SensorDataProducer {

    private final KafkaTemplate<String, SensorData> kafkaTemplate;

    @Autowired
    public SensorDataProducer(KafkaTemplate<String, SensorData> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, SensorData message) {
        kafkaTemplate.send(topic, message);
    }
}