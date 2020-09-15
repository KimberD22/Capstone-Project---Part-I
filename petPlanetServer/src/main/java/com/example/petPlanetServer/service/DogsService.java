package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Dogs;
import org.springframework.http.HttpStatus;

public interface DogsService {
    Iterable<Dogs> listDogs();
    static Dogs createDogs(Dogs dogs);
    Dogs getDogsById(Long id);
    HttpStatus deleteDogsById(Long id);
}
