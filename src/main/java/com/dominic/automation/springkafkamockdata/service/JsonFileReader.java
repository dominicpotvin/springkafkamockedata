package com.dominic.automation.springkafkamockdata.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


// JsonFileReader - Responsable de la lecture des fichiers JSON.

public class JsonFileReader {

    public static String readJsonFile(String filePath) throws IOException {
        ClassPathResource resource = new ClassPathResource(filePath);
        InputStreamReader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8);
        return FileCopyUtils.copyToString(reader);
    }
}
