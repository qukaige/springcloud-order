package com.example.order.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Title: MqController
 * @ProjectName order
 * @date 2019/11/2011:32
 */
@RestController
@RequestMapping("mq")
public class MqController {
    @Autowired
    private AmqpTemplate amqpTemplate;

    // 第1,2中方式
    @GetMapping("/send1")
    public void send1() {
        amqpTemplate.convertAndSend("myQueue", "now : " + new Date());
    }

    // 方式3发送
    @GetMapping("/send2")
    public void send2() {
        amqpTemplate.convertAndSend("myOrder","computer", "now : " + new Date());
    }
    @GetMapping("/send3")
    public void send3() {
        amqpTemplate.convertAndSend("myQueue","myExchange", "now : " + new Date());
    }
    @GetMapping("/send4")
    public void send4() {
        amqpTemplate.convertAndSend("myOrder","fruit", "now : " + new Date());
    }


}
