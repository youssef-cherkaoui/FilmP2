package com.Film.service;

import com.Film.dto.FavoFilmDTO;
import com.Film.dto.FavoSerieDTO;
import com.Film.model.FavoFilmModel;
import com.Film.model.FavoSerieModel;
import com.Film.repostorie.FavoSerieRepositorie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FavoSerieService {

    @Autowired
    private FavoSerieRepositorie favoSerieRepositorie;

    public List<FavoSerieDTO> getAllFavoSeries(){
        return favoSerieRepositorie.findAll().stream().map(FavoSerieModel -> {
            FavoSerieDTO favoSerieDTO = new FavoSerieDTO();
            favoSerieDTO.setIdFavoserie(FavoSerieModel.getIdFavoserie());

           // favoSerieDTO.setIdUser(FavoSerieModel.getUserModels().getFirst().getIdUser());
            return favoSerieDTO;
        }).collect(Collectors.toList());
    }

    public FavoSerieDTO addFavoSerie(FavoSerieDTO favoSerieDTO){
        FavoSerieModel favoserie = new FavoSerieModel();
        favoserie.setIdFavoserie(favoserie.getIdFavoserie());
        favoserie.setFavoSerieModels(favoserie.getFavoSerieModels());
        favoserie = favoSerieRepositorie.save(favoserie);
        return favoSerieDTO;
    }

    public void deleleFavoSerie(Long IdFavoserie){
        favoSerieRepositorie.deleteById(IdFavoserie);
    }

    public FavoSerieDTO getFavoSerieById(long IdFavoserie
    ) {
        Optional<FavoSerieModel> favoserieModelOptional = favoSerieRepositorie.findById(IdFavoserie);
        if (favoserieModelOptional.isPresent()) {
            FavoSerieModel favoserieModel = favoserieModelOptional.get();
            FavoSerieDTO favoserieDTO = new FavoSerieDTO();
            favoserieDTO.setIdFavoserie(favoserieDTO.getIdFavoserie());
            favoserieDTO.setIdSerie(favoserieDTO.getIdSerie());
            favoserieDTO.setIdUser(favoserieDTO.getIdUser());

            return favoserieDTO;
        } else {
            throw new RuntimeException("film n'est pas trouvé par ID: " + IdFavoserie);
        }
    }

}
