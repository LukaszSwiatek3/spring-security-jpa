package com.example.springsecurityjpa;

import com.example.springsecurityjpa.models.User;
import com.example.springsecurityjpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("lu@gmail.com");
        user.setPassword("lu2000");
        user.setFirstName("Lukasz");
        user.setLastName("Swiatek");

        User savedUser = userRepository.save(user);

        User existUser = entityManager.find(User.class, savedUser.getIdUser());

        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());

    }
}
