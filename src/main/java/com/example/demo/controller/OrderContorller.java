package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderContorller {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/save")
    public void save(){
        Order order=new Order();
        order.setNum(22L);
        orderService.save(order);
    }

    @RequestMapping("/del")
    public void delete(){
        Order order=new Order();
        order.setId(2L);
        orderService.del(order);
    }

}
