package com.example.library_management.service;

import com.example.library_management.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        MockitoAnnotations.initMocks(this);
        when(userRepository.findAll()).thenReturn(Collections.emptyList());

        assertEquals(0, userService.getAllUsers().size());
    }
}
