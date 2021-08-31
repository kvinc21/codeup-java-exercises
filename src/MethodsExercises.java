import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static int Addition(int x, int y){
        return x + y;
    }
    public static int Subtraction(int x, int y){
        return x - y;
    }
    public static int Multiplication(int x, int y){
        return x * y;
    }
    public static int Division(int x, int y){
        return x / y;
    }
    public static double Modulus(double x, double y){
        return x % y;
    }

    public static void main(String[] args) {
        System.out.println(Addition(5, 10));
        System.out.println(Subtraction(35, 20));
        System.out.println(Multiplication(5, -3));
        System.out.println(Division(45, 3));
        System.out.println(Modulus(45, 30));
    };

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);


    }
}

