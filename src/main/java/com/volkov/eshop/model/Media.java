package com.volkov.eshop.model;

import javax.persistence.*;

@Entity
@Table(name="medias")
public class Media {
    @Id
    private Long id;

    @Column
    private String url;
}
