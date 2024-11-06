package com.example.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/public")
public class IndexController {

    @GetMapping("/")
    public Map<String, String> index() {
        return new HashMap<>() {{
            put("status", "running!");
        }};
    }
}
