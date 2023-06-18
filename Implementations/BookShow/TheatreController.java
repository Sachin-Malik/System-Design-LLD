package Implementations.BookShow;

import Implementations.BookShow.Enums.City;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class TheatreController {
    Map<City, List<Theatre>> cityThethreMap;
    List<Theatre> allTheatres;

    TheatreController() {
        allTheatres = new ArrayList<Theatre>();
        cityThethreMap = new HashMap<City, List<Theatre>>();
    }
}
