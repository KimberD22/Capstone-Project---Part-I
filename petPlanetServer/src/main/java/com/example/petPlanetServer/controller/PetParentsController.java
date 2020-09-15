package com.example.petPlanetServer.controller;

import com.example.petPlanetServer.model.Petparents;
import com.example.petPlanetServer.service.PetParentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PetParents")
public class PetParentsController {
    @Autowired
    PetParentsService petParentsService;

    @GetMapping
    public Iterable<Petparents> listAllPetParents() {
        return petParentsService.listPetParents();
    }

    @PostMapping
    public Petparents createPetParents(@RequestBody Petparents petparents) {
        return petParentsService.createPetParents(petparents);
    }

    @GetMapping("/{id}")
    public Petparents getPetParentsById(@PathVariable Long id){
        return petParentsService.getPetParentsById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deletePetParents(@PathVariable Long id){
        return petParentsService.deletePetParentsById(id);
    }
}
