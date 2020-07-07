package com.volkov.eShop.model;

import javax.persistence.*;

@Entity
@Table(name = "adreesses")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String street;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "city_id")
    private City city;
    @Column
    private String homeNumber;
}
