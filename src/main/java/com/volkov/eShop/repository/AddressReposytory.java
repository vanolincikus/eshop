package com.volkov.eShop.repository;

import com.volkov.eShop.model.Adress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AddressReposytory extends CrudRepository<Adress,Long>{
}
