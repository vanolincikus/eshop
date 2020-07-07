package com.volkov.eShop.model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    private Long id;
}
