package com.example.petPlanetServer.controller;

import com.example.petPlanetServer.model.Fish;
import com.example.petPlanetServer.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Fish")
public class FishController {
    @Autowired
    FishService fishService;

    @GetMapping
    public Iterable<Fish> listAllFish() {
        return FishService.listFish();
    }

    @PostMapping
    public Fish createFish(@RequestBody Fish fish) {
        return fishService.createFish(fish);
    }

    @GetMapping("/{id}")
    public Fish getFishById(@PathVariable Long id){
        return FishService.getFishById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteFish(@PathVariable Long id){
        return FishService.deleteFishById(id);
    }
}
