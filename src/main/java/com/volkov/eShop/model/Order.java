package com.volkov.eShop.model;

import com.volkov.eShop.model.enums.*;
import org.hibernate.cache.spi.support.*;
import org.springframework.boot.autoconfigure.condition.*;

import javax.persistence.*;
import java.time.*;
import java.util.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private OrderType orderType;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
     @Column
    private Instant dateCreated;
     @Column
    private Instant dateupdated;
     @Column
    private Instant dateCompleted;

    @ManyToOne
    @JoinColumn(name="shipment_id")
    private Shipment shipment;

    @ManyToOne
    @JoinColumn(name="adress_id")
    private Adress adress;

    @OneToMany
    private Set<Item>items = new HashSet<>();





}
