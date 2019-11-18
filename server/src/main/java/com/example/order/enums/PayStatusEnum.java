package com.example.order.enums;

import lombok.Getter;

/**
 * @Title: PayStatusEnum
 * @ProjectName order
 * @date 2019/11/1514:42
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
