package com.example.order.client;

import com.example.order.dataobject.ProductInfo;
import com.example.order.dto.CartDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Title: ProductClient
 * @ProjectName order
 * @date 2019/11/1515:49
 */
@FeignClient(name = "product")
public interface ProductClient {
    @GetMapping("getMsg")
    String getMsg();

    @PostMapping("product/listForOrder")
    List<ProductInfo> listForOrder(List<String> productIdList);

    @PostMapping("product/decreaseStock")
    void decreaseStock(List<CartDTO> decreaseStockInputList);
}
