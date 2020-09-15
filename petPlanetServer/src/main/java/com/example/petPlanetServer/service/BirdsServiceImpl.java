package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Birds;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BirdsServiceImpl implements BirdsService {
    @Override
    public Iterable<Birds> listBirds() {
        return null;
    }

    @Override
    public Birds createBirds(Birds birds) {
        return null;
    }

    @Override
    public Birds getBirdsById(Long id) {
        return null;
    }

    @Override
    public HttpStatus deleteBirdsById(Long id) {
        return null;
    }
}
