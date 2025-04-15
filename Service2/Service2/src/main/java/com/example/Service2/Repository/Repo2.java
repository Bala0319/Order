package com.example.Service2.Repository;

import com.example.Service2.DTO2.Dto2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo2 extends JpaRepository<Dto2, Integer> {
}
