package com.example.petPlanetServer.service;

import com.example.petPlanetServer.model.Cats;
import org.springframework.http.HttpStatus;

import java.net.HttpCookie;

public interface CatsService {
    Iterable<Cats> listCats();
    Cats createCats(Cats cats);
    Cats getCatsById(Long id);
    HttpStatus deleteCatsById(Long id);

}
