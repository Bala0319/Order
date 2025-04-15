package com.example.Service3.Controller3;

import com.example.Service3.DTO3.Dto3;
import com.example.Service3.Producer;
import com.example.Service3.Service.Service3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {

    @Autowired
    private Service3 service3;

    @Autowired
    private Producer producer;

    @PostMapping("/save")
    public Dto3 save(@RequestBody Dto3 dto3) {
        System.out.println("IN 2nd SERVER");
        Dto3 savedData = service3.save(dto3);
        producer.sendMessage("Orders", dto3.toString());
        System.out.println("RECEIVED RESPONSE FROM 3rd SERVICE");
        return savedData;
    }
}
