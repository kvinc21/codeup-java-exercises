import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Subtraction(int x, int y) {
        return x - y;
    }

    public static int Multiplication(int x, int y) {
        return x * y;
    }

    public static int Division(int x, int y) {
        return x / y;
    }

    public static double Modulus(double x, double y) {
        return x % y;
    }

    public static void main(String[] args) {
        System.out.println(Addition(5, 10));
        System.out.println(Subtraction(35, 20));
        System.out.println(Multiplication(5, -3));
        System.out.println(Division(45, 3));
        System.out.println(Modulus(45, 30));
        int userResponse = getInteger(1, 10);
        System.out.println(getFactorial());
        System.out.println(diceRoll());
    }


    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        boolean userEntry = false;
        int userResponse = min - 1;

        do {
            if (userEntry) {
                System.out.println(userResponse + " is not with-in number range");
            }

            System.out.println("Enter a number between " + min + " and " + max);
            userResponse = scan.nextInt();

        } while (!(userResponse > min && userResponse <= max));
        return userResponse;

    }

//    Ex. 3

    public static int Factorial(int number) {
        int userNum = 1;
        for (int i = 1; i <= number; i++) {
            userNum *= i;
        }
        return userNum;
    }

    public static boolean getFactorial() {
        boolean continueON;
        do {
            System.out.println("Enter a number between 1 and 10: ");
            Scanner scan = new Scanner(System.in);
            int userInt = getInteger(1, 10);
            System.out.printf("The factorial is: " + Factorial(userInt));
            System.out.println("\n Do you wish to continue? ");
            continueON = scan.next().equals("y");
        } while (continueON);
        System.out.println("The End");
        return false;
    }

//    EX.4

    public static int getRandomRoll(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static boolean diceRoll() {
        Scanner scan = new Scanner(System.in);
        int numberOfSides = getInteger(1, 12);

        System.out.println("Roll the dice ");

        int firstRoll = getRandomRoll(1, numberOfSides);
        int secondRoll = getRandomRoll(1, numberOfSides);

        do {
            System.out.println("You rolled " + firstRoll);
            System.out.println("Do you wish to roll again? ");
        } while (scan.next().equals("y"));
        System.out.println("Your two rolls are: " + firstRoll + secondRoll);
        return false;
    }
}

