package com.example.petPlanetServer.controller;

import com.example.petPlanetServer.model.Pocketpets;
import com.example.petPlanetServer.service.PocketPetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PocketPets")
public class PocketPetController {

    @Autowired
    PocketPetsService pocketPetsService;

    @GetMapping
    public Iterable<Pocketpets> listAllPocketPets() {
        return pocketPetsService.listPocketPets();
    }

    @PostMapping
    public Pocketpets createPocketPets(@RequestBody Pocketpets pocketpets) {
        return pocketPetsService.createPocketPets(pocketpets);
    }

    @GetMapping("/{id}")
    public Pocketpets getPocketPetsById(@PathVariable Long id){
        return pocketPetsService.getPocketPetsById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deletePocketPets(@PathVariable Long id){
        return pocketPetsService.deletePocketPetsById(id);
    }
}