package com.example.petPlanetServer.repository;

import com.example.petPlanetServer.model.Fish;
import org.springframework.data.repository.CrudRepository;

public interface FishRepository extends CrudRepository<Fish, Long> {
}
