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

public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long IdUser;
    String UserName;
    String Password;
/*
    @ManyToOne
    @JoinColumn(name="IdFavofilm", nullable=false)
    private FavoFilmModel favoFilmModel;

    @ManyToOne
    @JoinColumn(name = "IdFavoserie", nullable = false)
    private FavoSerieModel favoSerieModel;*/

}
