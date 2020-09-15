package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Fish;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FishServiceImpl implements FishService {
    @Override
    public Iterable<Fish> listFish() {
        return null;
    }

    @Override
    public Fish createFish(Fish fish) {
        return null;
    }

    @Override
    public Fish getFishById(Long id) {
        return null;
    }

    @Override
    public HttpStatus deleteFishById(Long id) {
        return null;
    }
}
