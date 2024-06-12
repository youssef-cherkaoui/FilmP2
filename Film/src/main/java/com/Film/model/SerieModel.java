package com.Film.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SerieModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSerie;
    private String titre;
    private String description;
    private String dateSortie;
    private String duree;
    private String genre;
    private String realisateur;
    private String acteurs;
    private double note;
}
