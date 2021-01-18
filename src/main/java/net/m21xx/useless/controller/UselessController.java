package net.m21xx.useless.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/useless")
public class UselessController {

    @GetMapping("/")
    public ResponseEntity<String> index() {

        return ResponseEntity.ok("Hello world.");
    }

    @GetMapping("/throw")
    public ResponseEntity<String> slashThrow() {

        throw new RuntimeException("This is an exception.");

//        return ResponseEntity.ok("Hello world.");
    }

}
