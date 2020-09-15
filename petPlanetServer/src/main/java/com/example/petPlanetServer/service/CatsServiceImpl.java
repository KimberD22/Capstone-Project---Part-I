package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Cats;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CatsServiceImpl implements CatsService {
    @Override
    public Iterable<Cats> listCats() {
        return null;
    }

    @Override
    public Cats createCats(Cats cats) {
        return null;
    }

    @Override
    public Cats getCatsById(Long id) {
        return null;
    }

    @Override
    public HttpStatus deleteCatsById(Long id) {
        return null;
    }
}
