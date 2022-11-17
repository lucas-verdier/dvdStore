package com.lucas.dvd.repository;

import com.lucas.dvd.entity.Movie;
import java.util.List;

public interface MovieRepositoryInterface {

    void add(Movie movie);
    List<Movie> list();

}
