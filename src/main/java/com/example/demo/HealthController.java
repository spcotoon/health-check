package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthController {

    @GetMapping("/")
    public ResponseEntity<String> main() {
        log.info("connected");
        return ResponseEntity.ok().body("welcome");
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        log.info("healthy");
        return ResponseEntity.ok().body("i am healthy");
    }
}

