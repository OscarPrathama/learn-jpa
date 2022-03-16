package com.demo.springjpa.repositories;

import com.demo.springjpa.models.Location;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {
    
}
