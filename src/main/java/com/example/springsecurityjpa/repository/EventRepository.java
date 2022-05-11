package com.example.springsecurityjpa.repository;

import com.example.springsecurityjpa.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("SELECT e FROM Event e WHERE e.nameEvent =?1")
    Optional<Event> findByNameEvent(String nameEvent);

}
