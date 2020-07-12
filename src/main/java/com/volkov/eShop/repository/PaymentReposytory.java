package com.volkov.eShop.repository;

import com.volkov.eShop.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentReposytory extends CrudRepository<Payment,Long> {
}
