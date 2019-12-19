package com.example.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @Title: HystrixController
 * @ProjectName order
 * @date 2019/12/1911:34
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback") // 默认调用的方法名
public class HystrixController {
    // 超时配置
//    @HystrixCommand(commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
    @HystrixCommand
    @GetMapping("/getProductInfoList")
    public String getProductInfoList() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://127.0.0.1:8080/product/listForOrder",
                Arrays.asList("157875196366160022"),
                String.class);
//		throw new RuntimeException("发送异常了");
    }

    /**
     * 默认方法名, 如果8080服务不通,会调用
     *
     * @return
     */
    private String defaultFallback() {
        return "默认提示：太拥挤了, 请稍后再试~~";
    }
}