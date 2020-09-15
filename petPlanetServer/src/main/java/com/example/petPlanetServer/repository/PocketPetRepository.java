package com.example.petPlanetServer.repository;

import com.example.petPlanetServer.model.Pocketpets;
import org.springframework.data.repository.CrudRepository;

public interface PocketPetRepository extends CrudRepository<Pocketpets, Long> {
}
