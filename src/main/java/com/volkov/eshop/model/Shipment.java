package com.volkov.eshop.model;

import com.volkov.eshop.model.enums.*;

import javax.persistence.*;

@Entity
@Table(name = "shipments")
public class Shipment {
    @Id
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private ShipmentType shipmentType;
}

