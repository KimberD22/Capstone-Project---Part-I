package com.example.petPlanetServer.repository;

import com.example.petPlanetServer.model.Birds;
import org.springframework.data.repository.CrudRepository;

public interface BirdsRepository extends CrudRepository<Birds, Long> {
}
