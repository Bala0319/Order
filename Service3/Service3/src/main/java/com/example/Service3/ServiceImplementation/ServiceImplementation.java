package com.example.Service3.ServiceImplementation;

import com.example.Service3.DTO3.Dto3;
import com.example.Service3.Repository.Repo3;
import com.example.Service3.Service.Service3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation implements Service3 {
    @Autowired
    private Repo3 repo3;

    @Override
    public Dto3 save(Dto3 dto3) {
        return repo3.save(dto3);
    }
}
