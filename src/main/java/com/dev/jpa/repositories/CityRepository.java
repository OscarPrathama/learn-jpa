package com.dev.jpa.repositories;

import com.dev.jpa.entities.City;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    
}
