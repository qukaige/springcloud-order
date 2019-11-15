package com.example.order.repository;

import com.example.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Title: OrderMasterRepository
 * @ProjectName order
 * @date 2019/11/1514:34
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

}