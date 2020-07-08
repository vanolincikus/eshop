package com.volkov.eShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    private Long id;

    @Column
    private String reviewText;
}
