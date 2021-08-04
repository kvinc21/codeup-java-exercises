


public class StringExercise {
    public static void main(String[] args) {

        String pinkFloyd = "We don't need no education\nWe don't need no thought control";
        System.out.println(pinkFloyd);

        String checkOut = "Check\"this\"out!, \"s inside of \"s!";
            System.out.println(checkOut);

        String inWindows = "In windows, the main drive is usually C:\\";
            System.out.println(inWindows);

        String backlashes = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
            System.out.println(backlashes);
    }
};


import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob?");
        String userResponse = scanner.nextline().trim();

        if (userResponse.endsWith("?")) {
            System.out.println("Sure.");
        }
    }
}