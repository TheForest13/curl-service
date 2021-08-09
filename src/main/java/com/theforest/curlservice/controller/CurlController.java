package com.theforest.curlservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CurlController {

    @GetMapping("/clickMe")
    public String methodGet() {
        log.debug("попал");
        return "success";
    }
}
