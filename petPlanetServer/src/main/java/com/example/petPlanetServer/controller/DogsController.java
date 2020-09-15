package com.example.petPlanetServer.controller;


import com.example.petPlanetServer.model.Dogs;
import com.example.petPlanetServer.service.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Dogs")
public class DogsController {
    @Autowired
    DogsService dogsService;

    @GetMapping
    public Iterable<Dogs> listAllDogs() {
        return dogsService.listDogs();
    }

    @PostMapping
    public Dogs createDogs(@RequestBody Dogs dogs) {
        return dogsService createDogs(dogs);
    }

    @GetMapping("/{id}")
    public Dogs getDogsById(@PathVariable Long id){
        return dogsService.getDogsById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteDogs(@PathVariable Long id){
        return dogsService.deleteDogsById(id);
    }
}
