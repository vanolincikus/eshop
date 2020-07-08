package com.volkov.eShop.model;

import com.volkov.eShop.model.enums.*;
import org.hibernate.cache.spi.support.*;
import org.springframework.boot.autoconfigure.condition.*;

import javax.jws.soap.SOAPBinding;
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
    @JoinColumn(name = "user_id")
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
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    @OneToMany
    @JoinColumn(name = "item_id")
    private Set<Item> items = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Instant dateupdated) {
        this.dateupdated = dateupdated;
    }

    public Instant getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Instant dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
