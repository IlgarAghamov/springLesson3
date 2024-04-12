package org.example.controller;

import org.example.service.RegistrationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final RegistrationService registrationService;

    public UserController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/users/body")
    public void addUserFromBody(@RequestParam String name, @RequestParam int age, @RequestParam String email) {
        registrationService.processRegistration(name, age, email);
    }
}
