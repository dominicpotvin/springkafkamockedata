package com.dominic.automation.springkafkamockdata.config;

import com.dominic.automation.springkafkamockdata.model.SensorData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public KafkaTemplate<String, SensorData> kafkaTemplate(ProducerFactory<String, SensorData> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
}