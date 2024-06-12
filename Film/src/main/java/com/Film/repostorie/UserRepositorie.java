package com.Film.repostorie;

import com.Film.model.FilmModel;
import com.Film.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorie extends JpaRepository<UserModel,Long> {
}
