package com.example.demo.service;

import com.example.demo.entity.Order;

import java.util.List;


public interface OrderService {
    void save(Order order);
    void del(Order order);
    void upd(Order order);
    List<Order> findList(Order order);
}
