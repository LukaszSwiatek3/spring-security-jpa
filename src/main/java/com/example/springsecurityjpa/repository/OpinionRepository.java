package com.example.springsecurityjpa.repository;

import com.example.springsecurityjpa.models.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OpinionRepository extends JpaRepository<Opinion, Long> {
    
}
