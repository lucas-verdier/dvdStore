package com.lucas.dvd.service;

import com.lucas.dvd.entity.Movie;
import com.lucas.dvd.repository.MovieRepositoryInterface;
import com.lucas.dvd.repository.file.FileMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }

    public void getMovieList() {
        FileMovieRepository fileMovieRepository = new FileMovieRepository();
        fileMovieRepository.list();
    }

}
