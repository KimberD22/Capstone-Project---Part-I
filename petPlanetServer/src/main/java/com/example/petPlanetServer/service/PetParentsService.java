package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Petparents;
import org.springframework.http.HttpStatus;

public interface PetParentsService {
    Iterable<Petparents> listPetParents();
    Petparents createPetParents(Petparents petparents);
    Petparents getPetParentsById(Long id);
    HttpStatus deletePetParentsById(Long id);
}
