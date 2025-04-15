package com.example.Service1.ServiceImplementation;

import com.example.Service1.DTO1.Dto1;
import com.example.Service1.Repository.Repo1;
import com.example.Service1.Service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation implements Service1 {
    @Autowired
    private Repo1 repo1;

    @Override
    public Dto1 save(Dto1 dto3) {
        return repo1.save(dto3);
    }
}
