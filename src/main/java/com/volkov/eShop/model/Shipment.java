package com.volkov.eShop.model;

import com.volkov.eShop.model.enums.*;

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

