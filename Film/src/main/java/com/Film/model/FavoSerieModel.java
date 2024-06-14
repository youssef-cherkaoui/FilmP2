package com.Film.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FavoSerieModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdFavoserie;
    @JsonIgnore
    @OneToMany(mappedBy = "idSerie")
    private List<SerieModel> favoSerieModels;
    @JsonIgnore
    @OneToMany(mappedBy = "IdUser")
    private List<UserModel> userModels;

}
