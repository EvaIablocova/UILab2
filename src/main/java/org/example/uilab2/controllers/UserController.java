package org.example.uilab2.controllers;

import org.example.uilab2.DTOs.UserDTO;
import org.example.uilab2.serviceClient.UserServiceClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServiceClient userServiceClient;

    public UserController(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    @GetMapping
    public String getUsers(Model model) {
        List<UserDTO> users = userServiceClient.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userServiceClient.getUserById(id);
    }

    @PostMapping("/create")
    public String createUser(@RequestBody UserDTO userDTO) {
        userServiceClient.createUser(userDTO);
        return "redirect:/users";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        userServiceClient.updateUser(id, userDTO);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userServiceClient.deleteUser(id);
        return "redirect:/users";
    }

}
