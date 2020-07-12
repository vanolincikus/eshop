package com.volkov.eShop.repository;

import com.volkov.eShop.model.Media;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends CrudRepository<Media,Long> {
}
