package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cognizant.dto.UserDisplayDto;
import com.cognizant.dto.UserDto;
import com.cognizant.entity.User;
import com.cognizant.exception.InvalidException;
import com.cognizant.repository.UserRepository;
import com.cognizant.service.UserService;

@SpringBootTest
class LoginApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Mock
    private UserRepository userRepository;

    @Mock
    private BCryptPasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    private UserDto userDto;
    private User user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userDto = new UserDto("John Doe", "john@example.com", "password123", "1234567890");
        user = new User(1L, "John Doe","USER","john@example.com", "$2a$10$EncodedPassword", "1234567890");
    }

    @Test
    void testRegisterUser_Success() {
        when(userRepository.findByEmail(userDto.getEmail())).thenReturn(Optional.empty());
        when(passwordEncoder.encode(userDto.getPassword())).thenReturn("$2a$10$EncodedPassword");
        when(userRepository.save(any(User.class))).thenAnswer(inv -> {
            User u = inv.getArgument(0);
            u.setUserId(1L);
            return u;
        });

        User savedUser = userService.registerUser(userDto);

        assertNotNull(savedUser);
        assertEquals(userDto.getEmail(), savedUser.getEmail());
        verify(userRepository).save(any(User.class));
    }

    @Test
    void testRegisterUser_EmailAlreadyExists() {
        when(userRepository.findByEmail(userDto.getEmail())).thenReturn(Optional.of(user));

        assertThrows(InvalidException.class, () -> userService.registerUser(userDto));
    }
//
//    @Test
//    void testLogin_Success() {
//        when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.of(user));
//        when(passwordEncoder.matches("password123", user.getPassword())).thenReturn(true);
//
//        User loggedInUser = userService.login(user.getEmail(), "password123");
//
//        assertNotNull(loggedInUser);
//        assertEquals(user.getEmail(), loggedInUser.getEmail());
//    }

    @Test
    void testLogin_InvalidPassword() {
        when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.of(user));
        when(passwordEncoder.matches("wrongPassword", user.getPassword())).thenReturn(false);

        assertThrows(InvalidException.class, () -> userService.login(user.getEmail(), "wrongPassword"));
    }

    @Test
    void testLogin_EmailNotFound() {
        when(userRepository.findByEmail("notfound@example.com")).thenReturn(Optional.empty());

        assertThrows(InvalidException.class, () -> userService.login("notfound@example.com", "password123"));
    }

    @Test
    void testGetUserById_Success() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        UserDisplayDto dto = userService.getUserById(1L);

        assertNotNull(dto);
        assertEquals(user.getEmail(), dto.getEmail());
    }

    @Test
    void testGetUserById_NotFound() {
        when(userRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(InvalidException.class, () -> userService.getUserById(1L));
    }

    @Test
    void testUpdateUser_Success() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        when(userRepository.save(any(User.class))).thenReturn(user);

        UserDisplayDto updatedDto = new UserDisplayDto(1L, "John Updated", "john@example.com", "0987654321");
        UserDisplayDto result = userService.updateUser(1L, updatedDto);

        assertNotNull(result);
        assertEquals("John Updated", result.getName());
        assertEquals("0987654321", result.getContactNumber());
    }

    @Test
    void testUpdateUser_NotFound() {
        when(userRepository.findById(1L)).thenReturn(Optional.empty());

        UserDisplayDto dto = new UserDisplayDto(1L, "John Updated", "john@example.com", "0987654321");

        assertThrows(InvalidException.class, () -> userService.updateUser(1L, dto));
    }

    @Test
    void testDeleteUser() {
        doNothing().when(userRepository).deleteById(1L);

        userService.deleteUser(1L);

        verify(userRepository).deleteById(1L);
    }

}
