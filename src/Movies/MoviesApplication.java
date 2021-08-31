package Movies;

import util.Input;

import java.lang.String;
import java.lang.System;

public class MoviesApplication {

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println(menuDisplay());
            int response = userAnswer();
            running = userChoice(response);
        }
    }

    private static int userChoice(int choice) {
        boolean continueRunning = true;

        switch (choice) {
            System.out.println(menuDisplay());
            switch (choice) {
                case 0:
                    System.out.println("Good bye!");
                    continueRunning = false;
                    break;
                case 1: // VIEW ALL MOVIES
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    System.out.println();
                    viewMoviesByCategory("animated");
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    viewMoviesByCategory("drama");
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    viewMoviesByCategory("horror");
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    viewMoviesByCategory("scifi");
                    System.out.println();
                    break;
            }
            return running;
        }


        private static void viewMoviesByCategory( String category){
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equalsIgnoreCase(category)) {
                    System.out.printf("%s - %s\n", movie.getName(), movie.getCategory());
                }
            }
        }

        private static int promptUserAnswer () {
            Input input = new Input();
            System.out.println("Enter choice: ");
            int userAnswer = input.getInt(2, 4);
            return userAnswer;
        }

    }

    private static void viewMoviesByCategory(String animated) {
    }


    private static String menuDisplay() {

        return "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                " 3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";
    }
}
}
