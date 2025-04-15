package com.example.Service2.Controller2;

import com.example.Service2.DTO2.Dto2;
import com.example.Service2.Repository.Repo2;
import com.example.Service2.Service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller2 {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Service2 service2;


    @PostMapping("/save")
    public Dto2 save(@RequestBody Dto2 dto2) {
        System.out.println("IN 2nd SERVER");
        Dto2 savedData = service2.save(dto2);
        Dto2 resp = restTemplate.postForObject("http://localhost:8889/save",dto2,Dto2.class);
        System.out.println("RECEIVED RESPONSE FROM 3rd SERVICE");
        return resp;
    }


}
