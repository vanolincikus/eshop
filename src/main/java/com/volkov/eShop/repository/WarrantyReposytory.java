package com.volkov.eShop.repository;

import com.volkov.eShop.model.Warranty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarrantyReposytory extends CrudRepository<Warranty,Long> {
}
