package com.volkov.eShop.repository;

import com.volkov.eShop.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityReposytory extends CrudRepository<City,Long> {
}
