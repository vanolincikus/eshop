package com.volkov.eshop.repository;

import com.volkov.eshop.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityReposytory extends CrudRepository<City,Long> {
}
