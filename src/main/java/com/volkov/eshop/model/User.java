package com.volkov.eshop.model;

import com.volkov.eshop.model.enums.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String egn;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String password;
    @Column
    @Enumerated(EnumType.STRING)

    private UserType userType;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Set<Order> orders = new HashSet<>();

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "users_adresses",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private Set<Adress> userAdresses = new HashSet<>();

    private String status = "";

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Adress> getUserAdresses() {
        return userAdresses;
    }

    public void setUserAdresses(Set<Adress> userAdresses) {
        this.userAdresses = userAdresses;
    }


}
