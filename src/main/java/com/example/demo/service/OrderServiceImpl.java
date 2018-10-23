package com.example.demo.service;

import com.example.demo.dao.OrderRepository;
import com.example.demo.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void del(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public void upd(Order order) {
    }

    @Override
    public List<Order> findList(Order order) {
        return orderRepository.findAll();
    }

}
