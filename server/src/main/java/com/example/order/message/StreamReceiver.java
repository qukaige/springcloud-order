package com.example.order.message;

import com.example.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * 消息接收类
 * @Title: StreamReceiver
 * @ProjectName order
 * @date 2019/11/2015:09
 */
@Component
@EnableBinding(StreamClient.class)  // 定义的接口类
@Slf4j
public class StreamReceiver {
    // 接收字符串
    @StreamListener(value = StreamClient.INPUT)
    public void process1(Object message) {
        log.info("StreamReceiver: {}", message);
    }

   /**
     * 接收对象
     * @param message
     */
    /*@StreamListener(value = StreamClient.INPUT)
    @SendTo(value = StreamClient.INPUT2) // 接收成功后在回应一下
    public String process(OrderDTO message) {
        log.info("StreamReceiver: {}", message);
        return "ok";
    }

    // 回应接收
    @StreamListener(value = StreamClient.INPUT2)
    public void process2(String message) {
        log.info("INPUT2, {}", message);
    }*/

}
