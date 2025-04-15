package com.example.Service1.Controller;

import com.example.Service1.DTO1.Dto1;
import com.example.Service1.Service.Service1;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Controller1 {


    @Autowired
    private Service1 service1;

    @KafkaListener(topics = "Orders")
    public void consume(@RequestParam String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Dto1 dto1 = objectMapper.readValue(message,Dto1.class);
        service1.save(dto1);
    }
}
