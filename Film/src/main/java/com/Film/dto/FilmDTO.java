package com.Film.dto;


import lombok.Data;

@Data
public class FilmDTO {

    private String titre;
    private String description;
    private String dateSortie;
    private String duree;
    private String genre;
    private String realisateur;
    private String acteurs;
    private double note;
}
