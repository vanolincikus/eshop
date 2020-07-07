package com.volkov.eShop.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    private Long id;

    @Column
    private String paymentName;
}
