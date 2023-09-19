package com.examly.springapp.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.entities.Player;
import com.examly.springapp.entities.Team;
import com.examly.springapp.services.AdminService;

@RestController
@RequestMapping("/api/admin")

public class AdminController {
    private AdminService adminService;

    @CrossOrigin(origins = "https://8080-fafaecccbdadfdcfdeeefcbbdfefcbfbfaadecbbecc.premiumproject.examly.io")
    @GetMapping("/players")
    public List<Player> getAllPlayers() {
    int a=10;
}


