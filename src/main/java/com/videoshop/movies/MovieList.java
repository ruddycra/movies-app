package com.videoshop.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ruddyalvarado2
 * Date: 10/16/14
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieList {
    private List<Movie> movies;



    public MovieList(){
        this.movies = new ArrayList<>();

    }

    public int size(){
        return this.movies.size();
    }

    public void add(Movie movie){
        this.movies.add(movie);

    }
}
