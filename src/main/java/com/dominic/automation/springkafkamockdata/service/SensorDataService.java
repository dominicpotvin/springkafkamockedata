package com.dominic.automation.springkafkamockdata.service;
import com.dominic.automation.springkafkamockdata.model.SensorData;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ExecutionException;

@Service
public class SensorDataService {
    @Value("${kafka.topic.scheduledTasks}")
    private String topic;
    @Autowired
    private KafkaTemplate<String, SensorData> kafkaTemplate;
    @Autowired
    private AdminClient adminClient;

    public void sendSensorData(SensorData data) {
        kafkaTemplate.send(topic, data);
    }

    public boolean topicExists(String topicName) {
        ListTopicsResult listTopics = adminClient.listTopics();
        Set<String> topics;
        try {
            topics = listTopics.names().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error checking if topic exists", e);
        }
        return topics.contains(topicName);
    }
}