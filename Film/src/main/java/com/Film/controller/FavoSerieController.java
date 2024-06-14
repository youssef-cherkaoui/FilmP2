package com.Film.controller;

import com.Film.model.FavoSerieModel;
import com.Film.repostorie.FavoSerieRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FavoSerieController {

    @Autowired
    private FavoSerieRepositorie favoSerieRepositorie;

    @GetMapping
    public List<FavoSerieModel> getAllFavoSeries(){
        return favoSerieRepositorie.findAll();
    }

    @PostMapping
    public FavoSerieModel createFavoSerie(@RequestBody FavoSerieModel Favoserie){
        return favoSerieRepositorie.save(Favoserie);
    }

    @GetMapping("/R/{id}")
    public FavoSerieModel getFavoSerieById(@PathVariable long id){
        return favoSerieRepositorie.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteFavoSerie(@PathVariable long id){
        favoSerieRepositorie.deleteById(id);
    }

    @PutMapping("/{id}")
    public FavoSerieModel updateFavoSerie(@PathVariable long id, @RequestBody FavoSerieModel Favoserie) {
        Favoserie.setIdFavoserie(id);
        return favoSerieRepositorie.save(Favoserie);
    }
}
