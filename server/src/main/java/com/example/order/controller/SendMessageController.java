package com.example.order.controller;

import com.example.order.dto.OrderDTO;
import com.example.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Title: SendMessageController
 * @ProjectName order
 * @date 2019/11/2015:11
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    // 发送字符串
    /*@GetMapping("/sendMessage")
    public void sendMessage() {
        streamClient.output().send(MessageBuilder.withPayload("now " + new Date()).build());
    }*/

    /**
     * 发送对象
     */
    @GetMapping("/sendMessage")
    public void sendMessage() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123123123");
        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
    }

}
