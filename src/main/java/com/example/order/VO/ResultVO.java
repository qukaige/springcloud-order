package com.example.order.VO;

import lombok.Data;

/**
 * @Title: ResultVO
 * @ProjectName product
 * @date 2019/11/1510:40
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
