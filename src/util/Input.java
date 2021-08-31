package util;
import java.util.Scanner;

//


public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo() {
        String userAnswer = scanner.next();
        scanner.nextLine();
        return userAnswer.equals("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Give an Integer between" + min + " and " + max + ": ");
        int userInt;

        try {
            userInt = Integer.parseInt(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("This is not an integer!");
            return getInt(min, max);
        }

        if (userInt < min || userInt > max){
            System.out.println("Invalid input! Try again!");
            return getInt(min, max);
        }else {
            return userInt;
        }

    }

    public double getDouble() {
        return 0;
    }
}

//String getString()
//boolean yesNo()
//int getInt(int min, int max)
//int getInt()
//double getDouble(double min, double max)
//double getDouble()