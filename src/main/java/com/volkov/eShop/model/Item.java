package com.volkov.eShop.model;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "items")
public class Item {
    @Id
    private Long id;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "media_id")
    private Media media;

    @ManyToOne
    @JoinColumn(name="warranty_id")
    private Warranty warranty;
}
