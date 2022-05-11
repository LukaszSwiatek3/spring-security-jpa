package com.example.springsecurityjpa;

import com.example.springsecurityjpa.models.User;
import com.example.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AppController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public String home() {
        return "index";
    }


    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepository.save(user);

        return "register_success";
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody User user) {
        Optional<User> userFromDb = userRepository.findByUsername(user.getUsername());

        if (userFromDb.isEmpty() || wrongPassword(userFromDb, user)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        return ResponseEntity.ok().build();
    }

    private boolean wrongPassword(Optional<User> userFromDb, User user) {
        return !userFromDb.get().getPassword().equals(user.getPassword());
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

}
