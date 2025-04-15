package com.example.Service2.ServiceImplementation;

import com.example.Service2.DTO2.Dto2;
import com.example.Service2.Repository.Repo2;
import com.example.Service2.Service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImp2 implements Service2 {

    @Autowired
    private Repo2 repo2;

    @Override
    public Dto2 save(Dto2 dto2) {
        return repo2.save(dto2);
    }
}
