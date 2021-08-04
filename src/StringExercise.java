
//
//
//public class StringExercise {
//    public static void main(String[] args) {
//
//        String pinkFloyd = "We don't need no education\nWe don't need no thought control";
//        System.out.println(pinkFloyd);
//
//        String checkOut = "Check\"this\"out!, \"s inside of \"s!";
//            System.out.println(checkOut);
//
//        String inWindows = "In windows, the main drive is usually C:\\";
//            System.out.println(inWindows);
//
//        String backlashes = "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//            System.out.println(backlashes);
//    }
//};

//
//import java.util.Scanner;
//public class Bob {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Say something to Bob ");
//        Boolean continueOn = true;
//        do {
//            String userResponse = scanner.nextLine();
//            if (userResponse.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (userResponse.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//            } else if (userResponse.equals("")) {
//                System.out.println("Fine. Be that way!");
//            } else {
//                System.out.println("Whatever.");
//            }
//            System.out.println("Continue speaking to Bob? (y or n)");
//            String userInput = scanner.nextLine();
//            if (!userInput.equals("y")) {
//                continueOn = false;
//            }
//        } while (continueOn);
//    }
//}
