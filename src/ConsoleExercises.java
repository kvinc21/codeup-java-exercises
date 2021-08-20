import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately, %.2f", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer.");
        int userInt = scanner.nextInt();
        System.out.println("You have entered: " + userInt);


        System.out.println("Give me three words");
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String thirdWord = scanner.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("Enter a Sentence");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);








    }
}
