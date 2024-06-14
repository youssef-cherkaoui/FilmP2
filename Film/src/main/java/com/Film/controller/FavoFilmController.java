package com.Film.controller;

import com.Film.model.FavoFilmModel;
import com.Film.model.FilmModel;
import com.Film.repostorie.FavoFilmRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FavoFilmController {

    @Autowired
     private FavoFilmRepositorie favoFilmRepositorie;

    @GetMapping
    public List<FavoFilmModel> getAllFavoFilms(){
        return favoFilmRepositorie.findAll();
    }

    @PostMapping
    public FavoFilmModel createFavoFilm(@RequestBody FavoFilmModel Favofilm){
        return favoFilmRepositorie.save(Favofilm);
    }

    @GetMapping("/R/{id}")
    public FavoFilmModel getFavoFilmById(@PathVariable long id){
        return favoFilmRepositorie.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteFavoFilm(@PathVariable long id){
        favoFilmRepositorie.deleteById(id);
    }

    @PutMapping("/{id}")
    public FavoFilmModel updateFavoFilm(@PathVariable long id, @RequestBody FavoFilmModel Favofilm) {
        Favofilm.setIdFavofilm(id);
        return favoFilmRepositorie.save(Favofilm);
    }



}
