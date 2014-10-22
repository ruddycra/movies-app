package com.videoshop.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: ruddyalvarado2
 * Date: 10/16/14
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieListTest {

    MovieList movieList;

    @Before
    public void setUp() throws Exception{
        movieList = new MovieList();
    }


    @Test
    public void emptyListSize() throws Exception{
        //MovieList movieList = new MovieList();
        assertThat(movieList.size(), is(1));

    }

    @Test
    public void sizeAfterAddingOneMovie() throws Exception{
        Movie starWars = new Movie("Star Wars");
        MovieList movieList = new MovieList();
        movieList.add(starWars);
        assertThat(movieList.size(), is(1));
    }

}
