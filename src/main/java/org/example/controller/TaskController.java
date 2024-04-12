package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final UserService userService;

    public TaskController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/tasks/filter/{age}")
    public List<User> filterUsersByAge(@PathVariable int age) {
        return userService.filterUsersByAge(age);
    }

    @GetMapping("/tasks/calc")
    public double calculateAverageAge() {
        return userService.calculateAverageAge();
    }
}
