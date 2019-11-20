package com.example.order.controller;

import com.example.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: GirlConfig
 * @ProjectName order
 * @date 2019/11/1915:25
 */
@RestController
@RequestMapping("girl")
@RefreshScope
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;
    @GetMapping("/test")
    public String testGril() {
        return "name:" + girlConfig.getName() + " age:" + girlConfig.getAge();
    }
}
