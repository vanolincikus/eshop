package com.volkov.eshop.model;

import javax.persistence.*;
@Entity
@Table(name = "cities")
public class City {
    @Id
    private Long id;

    @Column
    private String cityName;
}
