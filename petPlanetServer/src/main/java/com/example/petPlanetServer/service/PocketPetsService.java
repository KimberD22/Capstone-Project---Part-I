package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Pocketpets;
import org.springframework.http.HttpStatus;

public interface PocketPetsService {
    Iterable<Pocketpets> listPocketPets();
    Pocketpets createPocketPets(Pocketpets pocketpets);
    Pocketpets getPocketPetsById(Long id);
    HttpStatus deletePocketPetsById(Long id);

}
