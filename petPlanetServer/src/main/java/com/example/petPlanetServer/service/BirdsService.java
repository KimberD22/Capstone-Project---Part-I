package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Birds;
import org.springframework.http.HttpStatus;

public interface BirdsService {
    Iterable<Birds> listBirds();
    Birds createBirds(Birds birds);
    Birds getBirdsById(Long id);
    HttpStatus deleteBirdsById(Long id);
}
