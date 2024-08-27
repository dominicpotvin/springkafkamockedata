package com.dominic.automation.springkafkamockdata.service;

import com.dominic.automation.springkafkamockdata.config.KafkaProducerConfig;
import com.dominic.automation.springkafkamockdata.model.SensorData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

// MockDataProducer (dans service) - Responsable de l'envoi des messages JSON à Kafka.
// classe ScheduledTasks (dans service) - Responsable de l'envoi des messages JSON à Kafka.
// Cette classe est responsable de l'envoi de messages JSON à Kafka à intervalles réguliers.
// Elle lit les fichiers JSON de données de capteur à partir du dossier de ressources et les envoie à Kafka.
// Les fichiers sont lus séquentiellement, et une fois que le dernier fichier est atteint, le premier fichier est lu à nouveau.

@Component
public class ScheduledTasks {

    @Value("${kafka.topic.scheduledTasks}")
    private String topic;
    private final SensorDataService sensorDataService;
    private static final String FILE_PREFIX = "data/data"; // Préfixe du fichier
    private static final String FILE_SUFFIX = ".json"; // Suffixe du fichier
    private int fileIndex = 1; // Index du fichier à envoyer

    public ScheduledTasks(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }
    @Autowired
    private KafkaProducerConfig kafkaProducerConfig;
    @Autowired
    private ObjectMapper objectMapper;

    @Scheduled(fixedRate = 1000) // Toutes les 5 secondes
    public void sendJsonFile() {
        try {
            String content = JsonFileReader.readJsonFile(FILE_PREFIX + fileIndex + FILE_SUFFIX);
            SensorData data = objectMapper.readValue(content, SensorData.class);
            sensorDataService.sendSensorData(data);
            fileIndex = (fileIndex % 6) + 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
