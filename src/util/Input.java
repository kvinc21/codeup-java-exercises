package util;

impor java.sql.SQLOutput;
import java.util.Scanner;



public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo(){
        String userAnswer = scanner.next();
        scanner.nextLine();
        return userAnswer.equals("y");
    }
}
