package com.dominic.automation.springkafkamockdata;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Properties;

@SpringBootApplication
@EnableScheduling
public class SpringkafkamockdataApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringkafkamockdataApplication.class, args);
	}

	@Bean
	public AdminClient adminClient() {
		Properties config = new Properties();
		config.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); // Remplacez par l'adresse de votre broker Kafka
		return AdminClient.create(config);
	}
}


