package com.example.petPlanetServer.repository;

import com.example.petPlanetServer.model.Cats;
import org.springframework.data.repository.CrudRepository;

public interface CatsRepository extends CrudRepository<Cats, Long> {
}
