package com.test.security.entity;

import com.test.security.constante.Currency;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    @Enumerated(EnumType.STRING)
    private Currency currency;
}
