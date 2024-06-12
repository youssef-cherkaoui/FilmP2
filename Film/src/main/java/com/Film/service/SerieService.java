package com.Film.service;

import com.Film.dto.FilmDTO;
import com.Film.dto.SerieDTO;
import com.Film.model.SerieModel;
import com.Film.repostorie.SerieRepositorie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class SerieService {

    @Autowired
    private SerieRepositorie serieRepositorie;

    public List<SerieDTO> getAllSeries(){
        return (List<SerieDTO>) serieRepositorie.findAll().stream().map(SerieModel -> {
            SerieDTO serieDTO = new SerieDTO();
            serieDTO.setActeurs(SerieModel.getActeurs());
            serieDTO.setDateSortie(SerieModel.getDateSortie());
            serieDTO.setDuree(SerieModel.getDuree());
            serieDTO.setTitre(SerieModel.getTitre());
            serieDTO.setGenre(SerieModel.getGenre());
            serieDTO.setNote(SerieModel.getNote());
            serieDTO.setDescription(SerieModel.getDescription());
            serieDTO.setDateSortie(SerieModel.getDateSortie());
            return serieDTO;
        }).collect(Collectors.toList());
    }

    public SerieDTO addSerie(SerieDTO serieDTO){
        SerieModel serie = new SerieModel();
        serie.setActeurs(serieDTO.getActeurs());
        serie.setDateSortie(serieDTO.getDateSortie());
        serie.setDuree(serieDTO.getDuree());
        serie.setTitre(serieDTO.getTitre());
        serie.setGenre(serieDTO.getGenre());
        serie.setNote(serieDTO.getNote());
        serie.setDescription(serieDTO.getDescription());
        serie.setRealisateur(serieDTO.getRealisateur());
        serie = serieRepositorie.save(serie);
        return serieDTO;
    }

}
