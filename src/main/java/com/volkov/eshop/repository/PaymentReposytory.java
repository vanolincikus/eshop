package com.volkov.eshop.repository;

import com.volkov.eshop.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentReposytory extends CrudRepository<Payment,Long> {
}
