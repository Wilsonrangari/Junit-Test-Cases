package com.wilson.project;

import com.wilson.project.binding.User;
import com.wilson.project.repository.UserRepository;
import com.wilson.project.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
class ProjectApplicationTests {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void UserSavedAbove_18_TestCase() {
        User user = new User("Wilson", 19, "w@gmail.com");

        userService.addUser(user); // Act
        // Assert
        verify(userRepository, times(1)).save(user);
       // Assertions.assertEquals(1, userRepository.save(););

    }

    @Test
    void UserSavedBelow_18_TestCase() {
        User user = new User("Wilson", 19, "w@gmail.com");

        userService.addUser(user); // Act
        // Assert
        verify(userRepository, times(1)).save(user);
        // Assertions.assertEquals(1, userRepository.save(););

    }

}
