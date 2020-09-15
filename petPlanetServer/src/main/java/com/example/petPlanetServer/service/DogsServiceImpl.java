package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Dogs;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DogsServiceImpl implements DogsService {
    @Override
    public Iterable<Dogs> listDogs() {
        return null;
    }

    @Override
    public Dogs createDogs(Dogs dogs) {
        return null;
    }

    @Override
    public Dogs getDogsById(Long id) {
        return null;
    }

    @Override
    public HttpStatus deleteDogsById(Long id) {
        return null;
    }
}
