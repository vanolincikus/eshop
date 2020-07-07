package com.volkov.eShop.model;

import com.volkov.eShop.model.enums.*;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.*;

@Entity
@Table(name ="users")
public class User {
    @Id
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

   @OneToMany
    private  List<Order> orders = new ArrayList<>();

   @ManyToMany
    @JoinTable(name= "users_adresses",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "address_id"))
      private Set<Adress>userAdresses= new HashSet<>();


}
