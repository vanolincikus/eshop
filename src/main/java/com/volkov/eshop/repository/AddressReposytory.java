package com.volkov.eshop.repository;

import com.volkov.eshop.model.Adress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AddressReposytory extends CrudRepository<Adress,Long>{
}
