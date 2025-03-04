package org.example.uilab2.serviceClient;

import org.example.uilab2.DTOs.UserDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceClient {

    private final RestTemplate restTemplate;

    public UserServiceClient() {
        this.restTemplate = new RestTemplate();
    }

    public List<UserDTO> getAllUsers() {
        String url = "http://localhost:9022/users"; // Адрес сервиса пользователей
        UserDTO[] users = restTemplate.getForObject(url, UserDTO[].class);
        return Arrays.asList(users);
    }

    public UserDTO getUserById(Long id) {
        String url = "http://localhost:9022/users/" + id;
        UserDTO user = restTemplate.getForObject(url, UserDTO.class);
        return user;
    }

    public UserDTO createUser(UserDTO userDTO){
        String url = "http://localhost:9022/users";
        UserDTO createdUser = restTemplate.postForObject(url, userDTO, UserDTO.class);
        return createdUser;
    }

    public void updateUser(Long id, UserDTO userDTO) {
        String url = "http://localhost:9022/users/" + id;
        restTemplate.put(url, userDTO);
    }

    public void deleteUser(Long id) {
        String url = "http://localhost:9022/users/" + id;
        restTemplate.delete(url);
    }

}
