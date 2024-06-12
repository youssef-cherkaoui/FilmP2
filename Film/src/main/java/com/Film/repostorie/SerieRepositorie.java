package com.Film.repostorie;

import com.Film.model.FilmModel;
import com.Film.model.SerieModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepositorie extends JpaRepository<SerieModel,Long> {
}
