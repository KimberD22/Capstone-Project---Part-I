package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Fish;
import org.springframework.http.HttpStatus;

import javax.net.ssl.HttpsURLConnection;

public interface FishService {
    Iterable<Fish> listFish();
    Fish createFish(Fish fish);
    Fish getFishById(Long id);
    HttpStatus deleteFishById(Long id);
}
