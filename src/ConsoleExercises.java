<<<<<<< HEAD
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

        System.out.println("Enter the length value of your classroom: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the length and width values of your classroom: ");
        double width = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = (length * 2) + (length * 2);

        System.out.println("The Area of the classroom is: " + area);
        System.out.println("Perimeter: " + perimeter);








    }
}
=======
>>>>>>> 5a3b8a341b5d158634e98155c03ffe227536e63a
