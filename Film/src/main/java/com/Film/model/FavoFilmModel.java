package com.Film.model;

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
    private Long IdFavo;

   /* @OneToMany(mappedBy = "idMovie")
    private List<FilmModel> favoFilmModels;

    @OneToMany(mappedBy = "IdUser")
    private List<UserModel> userModels;*/
}
