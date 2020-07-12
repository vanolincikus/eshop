package com.volkov.eShop.repository;

import com.volkov.eShop.model.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment,Long> {
}
