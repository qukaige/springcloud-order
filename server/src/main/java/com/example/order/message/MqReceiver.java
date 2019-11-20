package com.example.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Title: MqReceiver
 * @ProjectName order
 * @date 2019/11/2011:06
 */
@Slf4j
@Component
public class MqReceiver {

    //第一种方法 , 需要先创建队列
    // 1. @RabbitListener(queues = "myQueue")
    /*@RabbitListener(queues = "myQueue")
    public void process1(Object message) {
        log.info("MqReceiver message:{}" , message);
    }*/

    //2. 自动创建队列 @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    /*@RabbitListener(queuesToDeclare = @Queue("myQueue"))
    public void process2(Object message) {
        log.info("MqReceiver message:{}" , message);
    }*/

    //3. 自动创建, Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue"),exchange = @Exchange("myExchange")))
    public void process(String message) {
        log.info("MqReceiver: {}", message);
    }

    /**
     * 分组
     * 数码供应商服务 接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(exchange = @Exchange("myOrder"),key = "computer",value = @Queue("computerOrder")))
    public void processComputer(String message) {
        log.info("computer MqReceiver: {}", message);
    }
    /**
     * 水果供应商服务 接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(exchange = @Exchange("myOrder"),key = "fruit",value = @Queue("fruitOrder")))
    public void processFruit(String message) {
        log.info("fruit MqReceiver: {}", message);
    }

}
