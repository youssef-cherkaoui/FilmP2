package com.Film.controller;


import com.Film.dto.FilmDTO;
import com.Film.model.FilmModel;
import com.Film.repostorie.FilmRepositorie;
import com.Film.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/film")

public class FilmController {


    @Autowired
    private FilmRepositorie filmRepositorie;
    @Autowired
    private MovieService  movieService ;

    @GetMapping
    public List<FilmDTO> getAllFilms(){
        return movieService.getAllFilms();
    }

    @PostMapping
    public FilmModel createFilm(@RequestBody FilmModel film){
        return filmRepositorie.save(film);
    }

    @GetMapping("/R/{id}")
    public FilmModel getFilmById(@PathVariable long id){
        return filmRepositorie.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteFilm(@PathVariable long id){
         filmRepositorie.deleteById(id);
    }

    @PutMapping("/{id}")
    public FilmModel updateFilm(@PathVariable long id, @RequestBody FilmModel film){
        film.setIdMovie(id);
        return filmRepositorie.save(film);
    }


}
