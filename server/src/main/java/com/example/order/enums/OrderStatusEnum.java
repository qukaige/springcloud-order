package com.example.order.enums;

import lombok.Getter;

/**
 * @Title: OrderStatusEnum
 * @ProjectName order
 * @date 2019/11/1514:41
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
