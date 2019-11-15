package com.example.order.repository;

import com.example.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Title: OrderDetailRepository
 * @ProjectName order
 * @date 2019/11/1514:34
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}