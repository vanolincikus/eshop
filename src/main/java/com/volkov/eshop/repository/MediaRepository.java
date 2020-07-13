package com.volkov.eshop.repository;

import com.volkov.eshop.model.Media;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends CrudRepository<Media,Long> {
}
