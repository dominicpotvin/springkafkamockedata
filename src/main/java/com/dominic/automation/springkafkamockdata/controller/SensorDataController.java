package com.dominic.automation.springkafkamockdata.controller;
import com.dominic.automation.springkafkamockdata.model.SensorData;
import com.dominic.automation.springkafkamockdata.service.SensorDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensor")
public class SensorDataController {

    private final SensorDataService sensorDataService;
    @Value("${kafka.topic.scheduledTasks}")
    private String topic;

    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody SensorData data) {
        if (!sensorDataService.topicExists(topic)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Kafka topic does not exist");
        }
        sensorDataService.sendSensorData(data);
        return ResponseEntity.status(HttpStatus.CREATED).body("Data sent to Kafka topic");
    }
}