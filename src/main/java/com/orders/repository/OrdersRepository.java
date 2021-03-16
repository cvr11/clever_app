package com.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orders.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>{

}
