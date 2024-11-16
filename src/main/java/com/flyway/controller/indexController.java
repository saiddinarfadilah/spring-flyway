package com.flyway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class indexController {

    @GetMapping("/")
    public Object index() {
        Map<String, Object> restResponse = new HashMap<>();
        restResponse.put("message", "spring flyway");
        log.info(restResponse.toString());
        return restResponse;
    }
}
