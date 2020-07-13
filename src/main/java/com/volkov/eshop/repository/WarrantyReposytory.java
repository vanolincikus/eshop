package com.volkov.eshop.repository;

import com.volkov.eshop.model.Warranty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarrantyReposytory extends CrudRepository<Warranty,Long> {
}
