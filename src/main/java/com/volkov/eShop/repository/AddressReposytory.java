package com.volkov.eShop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sun.jvm.hotspot.debugger.Address;

@Repository
public interface AddressReposytory extends CrudRepository<Address,Long>{
}
