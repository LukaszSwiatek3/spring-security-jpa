package com.example.springsecurityjpa.service;

import com.example.springsecurityjpa.models.Event;
import com.example.springsecurityjpa.models.Opinion;
import com.example.springsecurityjpa.models.User;
import com.example.springsecurityjpa.repository.EventRepository;
import com.example.springsecurityjpa.repository.OpinionRepository;
import com.example.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/opinions")
public class OpinionService {
    @Autowired
    OpinionRepository opinionRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    EventRepository eventRepository;

    @GetMapping("")
    public List<Opinion> getAll() {
        return opinionRepository.getAll();
    }

    @PostMapping("/post")
    public ResponseEntity addPost(@RequestHeader("username") String username, @RequestBody Double rating, @RequestBody String description, @RequestBody String event) {
        Optional<User> userFromDb = userRepository.findByUsername(username);

        if (userFromDb.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Optional<Event> eventFromDb = eventRepository.findByNameEvent(event);

        if (userFromDb.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String time = "godzina";

        Opinion opinion = new Opinion(rating, description, userFromDb.get(), time, eventFromDb.get());
        Opinion savedOpinion = opinionRepository.save(opinion);

        return ResponseEntity.ok(savedOpinion);
    }

//    @GetMapping("/{id}")
//    public



}
