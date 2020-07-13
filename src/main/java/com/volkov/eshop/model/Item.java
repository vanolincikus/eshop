package com.volkov.eshop.model;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
