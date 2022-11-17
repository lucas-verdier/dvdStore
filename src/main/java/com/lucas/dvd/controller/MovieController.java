package com.lucas.dvd.controller;

import com.lucas.dvd.entity.Movie;
import com.lucas.dvd.service.MovieServiceInterface;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez le genre du film :");
        String genre = sc.nextLine();
        System.out.println("Saississez le titre du film :");
        String title = sc.nextLine();

        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(title);

        movieService.registerMovie(movie);
    }
}
