package com.Film.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FavoFilmModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdFavofilm;
//    @JsonIgnore
//    @OneToMany(mappedBy = "idMovie")
//    private List<FilmModel> listFilm;
//@JsonIgnore
//    @OneToMany(mappedBy = "IdUser")
//    private List<UserModel> userModels;
}
