package com.example.petPlanetServer.repository;

import com.example.petPlanetServer.model.Dogs;
import org.springframework.data.repository.CrudRepository;

public interface DogsRepository extends CrudRepository<Dogs, Long> {
}
