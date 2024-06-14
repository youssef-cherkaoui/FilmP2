package com.Film.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FilmModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMovie;
    private String titre;
    private String description;
    private String dateSortie;
    private String duree;
    private String genre;
    private String realisateur;
    private String acteurs;
    private double note;

    @ManyToOne
    @JoinColumn(name="IdFavo" , nullable = true)
    private FavoFilmModel favoFilmModel;

}
