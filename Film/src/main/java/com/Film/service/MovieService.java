package com.Film.service;

import com.Film.dto.FilmDTO;
import com.Film.dto.SerieDTO;
import com.Film.model.FilmModel;
import com.Film.model.SerieModel;
import com.Film.repostorie.FilmRepositorie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    @Autowired
    private FilmRepositorie filmRepositorie;


    public List<FilmDTO> getAllFilms(){
        return (List<FilmDTO>) filmRepositorie.findAll().stream().map(FilmModel -> {
            FilmDTO filmDTO = new FilmDTO();
            filmDTO.setActeurs(FilmModel.getActeurs());
            filmDTO.setDateSortie(FilmModel.getDateSortie());
            filmDTO.setDuree(FilmModel.getDuree());
            filmDTO.setTitre(FilmModel.getTitre());
            filmDTO.setGenre(FilmModel.getGenre());
            filmDTO.setNote(FilmModel.getNote());
            filmDTO.setDescription(FilmModel.getDescription());
            filmDTO.setDateSortie(FilmModel.getDateSortie());
            return filmDTO;
        }).collect(Collectors.toList());
    }


    public FilmDTO addFilm(FilmDTO filmDTO){
        FilmModel film = new FilmModel();
        film.setActeurs(filmDTO.getActeurs());
        film.setDateSortie(filmDTO.getDateSortie());
        film.setDuree(filmDTO.getDuree());
        film.setTitre(filmDTO.getTitre());
        film.setGenre(filmDTO.getGenre());
        film.setNote(filmDTO.getNote());
        film.setDescription(filmDTO.getDescription());
        film.setRealisateur(filmDTO.getRealisateur());
        film = filmRepositorie.save(film);
        return filmDTO;
    }




}
