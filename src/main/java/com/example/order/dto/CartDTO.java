package com.example.order.dto;

import lombok.Data;

/**
 * @Title: CartDTO
 * @ProjectName product
 * @date 2019/11/1516:57
 */
@Data
public class CartDTO {
    private String productId;

    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
