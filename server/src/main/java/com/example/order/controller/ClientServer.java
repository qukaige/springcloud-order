package com.example.order.controller;

import com.example.product.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: ClientServer
 * @ProjectName order
 * @date 2019/11/1515:08
 */
@RestController
public class ClientServer {

    /*// 方式2
    @Autowired
    LoadBalancerClient loadBalancerClient;

    // 方式3
    @Autowired
    private RestTemplate restTemplate;*/

    @Autowired
    private ProductClient productClient;
    @GetMapping("getmsg")
    public String getmsg() {
        // RestTemplate方式1
        /*RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://localhost:8080/getMsg", String.class);*/

        // RestTemplate方式2 loadBalancerClient
        /*RestTemplate restTemplate = new RestTemplate();
        ServiceInstance product = loadBalancerClient.choose("PRODUCT");
        String url = String.format("http://{}:{}/getMsg", product.getHost(), product.getPort());
        return restTemplate.getForObject(url, String.class);*/

        // 方式3
//        return restTemplate.getForObject("http://PRODUCT/getMsg", String.class);

        // feign 方式
        String msg = productClient.getMsg();
        return msg;
    }
}
