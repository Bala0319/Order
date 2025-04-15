package com.example.Service1.Repository;

import com.example.Service1.DTO1.Dto1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo1 extends JpaRepository<Dto1, Integer> {
}
