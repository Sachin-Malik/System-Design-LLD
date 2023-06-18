package Implementations.BookShow;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;

    BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.intialize();

        return;
    }

    public void intialize() {

        createMovies();
        createTheatres();
    }

    private void createMovies() {

    }

    private void createTheatres() {

    }
}
