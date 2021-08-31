package Movies;

import util.Input;

import java.lang.String;
import java.lang.System;

public class MoviesApplication {
    static Input input = new Input();
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean continueOn = true;

        System.err.println("Movie decisions");
        do {
            System.out.println("What would you like to do?\n" +

                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    " 3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");

            int userResponse = input.getInt(0, 5);

            switch (userResponse) {
                case 0:
                    System.out.println("Good bye!");
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies)
                        if (movie.getCategory().equals("drama")) {
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                        }
                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                        }
                    }
                        break;
                        case 5:
                            for (Movie movie : movies) {
                                if (movie.getCategory().equals("scifi")) {
                                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                                }
                            }
                            break;
                default:
                            System.err.println("The end");
                    }
                    System.out.println("Continue?");
                    continueOn = input.yesNo();
        } while (continueOn);
    }
}
