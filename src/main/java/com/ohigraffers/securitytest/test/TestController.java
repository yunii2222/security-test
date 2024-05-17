package com.ohigraffers.securitytest.test;

import jakarta.websocket.server.PathParam;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/posts")
    public ResponseEntity<Void> savePosts() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/categories")
    public ResponseEntity<Void> saveCategories() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
