package Movies;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;

public class MoviesApplication {

    private static Object MoviesArray;

    public static void main(String[] args){

        Movie[] movies = Movies.MoviesArray.findAll();
        System.out.println("Movie list: " + MoviesArray);

        }

        Movie[] movies = MoviesArray.findAll();
    public static Movie[] findAll() {

        String menu = "What would you like to do?" +
                "\n" +
            "0 - exit\n" +
            "1 - view all movies\n" +
          "2 - view movies in the animated category\n" +
           " 3 - view movies in the drama category\n" +
            "4 - view movies in the horror category\n" +
            "5 - view movies in the scifi category";

            return findAll();
        }

    public static void movies(Movie[] movies, String category) {
        for (Movie movie: movies){
            if(category.equalsIgnoreCase(movie.getCategory())){
                System.out.println(movies.getClass() + " " + movie.getCategory);
            }
        }
    }
}
