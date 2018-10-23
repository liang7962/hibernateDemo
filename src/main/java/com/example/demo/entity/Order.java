package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="t_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//主键自增长
    private Long id;

    @Column(name="num",nullable = false)
    private Long num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }


    public Order() {
    }
}
