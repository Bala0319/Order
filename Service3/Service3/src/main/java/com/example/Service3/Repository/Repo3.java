package com.example.Service3.Repository;

import com.example.Service3.DTO3.Dto3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo3 extends JpaRepository<Dto3, Integer> {
}
