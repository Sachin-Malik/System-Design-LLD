package Implementations.BookShow;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import Implementations.BookShow.Enums.City;

public class MovieController {

    List<Movie> allMovies;
    Map<City, List<Movie>> cityMovieMap;

    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);
        List<Movie> movies = cityMovieMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityMovieMap.put(city, movies);

    }
}
