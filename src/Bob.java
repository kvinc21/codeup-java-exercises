import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob ");
        Boolean continueOn = true;
        do {
            String userResponse = scanner.nextLine();
            if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Continue speaking to Bob? (y or n)");
            String userInput = scanner.nextLine();
            if (!userInput.equals("y")) {
                continueOn = false;
            }
        } while (continueOn);
    }
}