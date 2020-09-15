package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Petparents;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PetParentsServiceImpl implements PetParentsService {
    @Override
    public Iterable<Petparents> listPetParents() {
        return null;
    }

    @Override
    public Petparents createPetParents(Petparents petparents) {
        return null;
    }

    @Override
    public Petparents getPetParentsById(Long id) {
        return null;
    }

    @Override
    public HttpStatus deletePetParentsById(Long id) {
        return null;
    }
}
