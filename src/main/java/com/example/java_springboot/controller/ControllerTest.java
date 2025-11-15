package com.example.java_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping("/teste")
    public String teste( ) {
        return "amo a sahina";
    }

    @GetMapping("/teste2")
    public String teste2() {
        return "Teste2";
    }
}
