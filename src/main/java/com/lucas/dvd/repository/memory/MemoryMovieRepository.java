package com.lucas.dvd.repository.memory;

import com.lucas.dvd.entity.Movie;
import com.lucas.dvd.repository.MovieRepositoryInterface;
import com.lucas.dvd.service.DefaultMovieService;
import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" ("+movie.getGenre()+") has ben added.");

    }

    @Override
    public List<Movie> list() {
        return movies;
    }
}
