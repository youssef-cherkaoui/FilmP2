package com.Film.repostorie;

import com.Film.model.FilmModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepositorie extends JpaRepository<FilmModel,Long> {
}
