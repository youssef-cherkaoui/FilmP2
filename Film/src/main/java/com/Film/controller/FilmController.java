package com.Film.controller;


import com.Film.model.FilmModel;
import com.Film.repostorie.FilmRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")

public class FilmController {


    @Autowired
    private FilmRepositorie filmRepositorie;

    @GetMapping
    public List<FilmModel> getAllFilms(){
        return filmRepositorie.findAll();
    }

    @PostMapping
    public FilmModel createFilm(@RequestBody FilmModel film){
        return filmRepositorie.save(film);
    }

}
