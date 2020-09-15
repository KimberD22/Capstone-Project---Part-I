package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Pocketpets;
import com.example.petPlanetServer.repository.PocketPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PocketPetsServiceImpl implements PocketPetsService {
    @Autowired
    PocketPetRepository pocketPetRepository;

    @Override
    public Iterable<Pocketpets> listPocketPets() {
        return pocketPetRepository.findAll();
    }

    @Override
    public Pocketpets createPocketPets(Pocketpets pocketpets) {
        return pocketPetRepository.save(pocketpets);
    }

    @Override
    public Pocketpets getPocketPetsById(Long id) {
        return pocketPetRepository.findById(id).get();
    }

    @Override
    public HttpStatus deletePocketPetsById(Long id) {
        pocketPetRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
