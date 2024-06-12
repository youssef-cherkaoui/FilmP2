package com.Film.repostorie;

import com.Film.model.FavoFilmModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoFilmRepositorie extends JpaRepository<FavoFilmModel,Long> {
}
