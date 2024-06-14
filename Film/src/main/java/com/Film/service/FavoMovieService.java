package com.Film.service;

import com.Film.dto.FavoFilmDTO;
import com.Film.dto.FilmDTO;
import com.Film.model.FavoFilmModel;
import com.Film.model.FilmModel;
import com.Film.repostorie.FavoFilmRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class FavoMovieService {

    @Autowired
    private FavoFilmRepositorie favoFilmRepositorie;


    public List<FavoFilmDTO> getAllFavoFilms(){
        return favoFilmRepositorie.findAll().stream().map(FavoFilmModel -> {
            FavoFilmDTO favofilmDTO = new FavoFilmDTO();
            favofilmDTO.setIdFavofilm(FavoFilmModel.getIdFavofilm());
         //   favofilmDTO.setIdMovie(FavoFilmModel.getFavoFilmModels().getFirst().getIdMovie());
         //   favofilmDTO.setIdUser(FavoFilmModel.getUserModels().getFirst().getIdUser());
            return favofilmDTO;
        }).collect(Collectors.toList());
    }

    public FavoFilmDTO addFavoFilm(FavoFilmDTO favoFilmDTO){
        FavoFilmModel favofilm = new FavoFilmModel();
        favofilm.setIdFavofilm(favofilm.getIdFavofilm());
//        favofilm.setFavoFilmModels(favofilm.getFavoFilmModels());
//        favofilm.setUserModels(favofilm.getUserModels());

        favofilm = favoFilmRepositorie.save(favofilm);
        return favoFilmDTO;
    }

    public void deleleFavoFilm(Long IdFavofilm){
        favoFilmRepositorie.deleteById(IdFavofilm);
    }

    public FavoFilmDTO getFavoFilmById(long IdFavofilm
    ) {
        Optional<FavoFilmModel> favofilmModelOptional = favoFilmRepositorie.findById(IdFavofilm);
        if (favofilmModelOptional.isPresent()) {
            FavoFilmModel favofilmModel = favofilmModelOptional.get();
            FavoFilmDTO favofilmDTO = new FavoFilmDTO();
            favofilmDTO.setIdFavofilm(favofilmDTO.getIdFavofilm());
            favofilmDTO.setIdMovie(favofilmDTO.getIdMovie());
            favofilmDTO.setIdUser(favofilmDTO.getIdUser());

            return favofilmDTO;
        } else {
            throw new RuntimeException("film n'est pas trouvé par ID: " + IdFavofilm);
        }
    }

}
