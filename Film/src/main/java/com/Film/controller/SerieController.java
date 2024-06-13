package com.Film.controller;

import com.Film.model.FilmModel;
import com.Film.model.SerieModel;
import com.Film.repostorie.SerieRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/serie")

public class SerieController {

    @Autowired
    private SerieRepositorie serieRepositorie;

    @GetMapping
    public List<SerieModel> getAllSeries(){
        return serieRepositorie.findAll();
    }

    @PostMapping
    public SerieModel createFilm(@RequestBody SerieModel serie){
        return serieRepositorie.save(serie);
    }

    @GetMapping("/R/{id}")
    public SerieModel getSerieById(@PathVariable long id){
        return serieRepositorie.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteSerie(@PathVariable long id){

        serieRepositorie.deleteById(id);
    }

    @PutMapping("/{id}")
    public SerieModel updateSerie(@PathVariable long id, @RequestBody SerieModel serie){
        serie.setIdSerie(id);
        return serieRepositorie.save(serie);
    }


}
