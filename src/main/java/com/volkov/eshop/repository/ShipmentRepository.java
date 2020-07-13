package com.volkov.eshop.repository;

import com.volkov.eshop.model.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment,Long> {
}
