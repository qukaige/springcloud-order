package com.example.order.exception;

import com.example.order.enums.ResultEnum;

/**
 * @Title: OrderException
 * @ProjectName order
 * @date 2019/11/1514:19
 */
public class OrderException extends RuntimeException {
    private Integer code;
    public OrderException (Integer code,String message){
        super(message);
        this.code = code;
    }
    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
