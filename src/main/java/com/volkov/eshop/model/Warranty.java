package com.volkov.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name="warranties")
public class Warranty {
    @Id
    private Long id;
    @Column
    private Instant expDate;
    @Column
    private String warrantyDescription;

}
