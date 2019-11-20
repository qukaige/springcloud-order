package com.example.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: DevController
 * @ProjectName order
 * @date 2019/11/1914:03
 */
@RestController
@RequestMapping("env")
public class DevController {
    @Value("${env}")
    private String env;
    @GetMapping("test")
    public String test() {
        return env;
    }
}
