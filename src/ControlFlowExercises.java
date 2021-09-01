import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int i = 5;
        while(i <= 15){
            System.out.print(i + " ");
            i++;
        }

        int x = 0;
        do{
            System.out.println(x);
            x += 2;
        }while(x <= 100);

        for(x = 0; x <= 100; x += 2){
            System.out.println(x);
        }

        x = 100;
        do{
            System.out.println(x);
            x -= 5;
        }while(x >= -10);

        for(x = 100;x >= -10;x -= 5){
            System.out.println(x);
        }

        long y = 2;
        do{
            System.out.println(y);
            y = y * y;
        }while(y <= 1000000);

        for(long y2 = 2; y2 <= 1000000; y2 = y2 * y2){
            System.out.println(y2);
        }

            for ( int j = 1; j <= 100; j++) {
                if (j % 5 == 0 && j % 3 == 0){
                    System.out.println("FizzBuzz");
                } else if(j % 5 == 0){
                    System.out.println("Buzz");
                } else if (j % 3 == 0){
                    System.out.println("Fizz");
                } else {
                    System.out.println(j);
                }

            }

            Scanner scanner = new Scanner(System.in);
            boolean userContinues = true;

            do {
                System.out.println("What number would you like to go up to? ");
                int answer = scanner.nextInt();
                System.out.println("\n Here is you table \n");
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");
                for (int count = 1; count <= answer; count++){
                    System.out.printf("%-6d",count);
                    System.out.print(" | ");
                    System.out.printf("%-7d", count * count);
                    System.out.print(" | ");
                    System.out.println( count * count * count);
                }
                System.out.println("Would you like to enter another number (y/n)? ");
                String userResponse = scanner.next();
                if (!userResponse.equalsIgnoreCase("y")){
                    userContinues = false;
                }
            }   while (userContinues);

            System.out.println("Thank you");
                boolean anotherGrade = true;

                do {
                    System.out.println("Enter numerical grade from 0 to 100");
                    int grade = scanner.nextInt();

                    if (grade >= 88) {
                        System.out.println("A");
                    } else if (grade >= 80) {
                        System.out.println("B");
                    } else if (grade >= 67) {
                        System.out.println("C");
                    } else if (grade >= 60) {
                        System.out.println("D");
                    } else {
                        System.out.println("F");
                    }
                    System.out.println("Enter new grade? (y/n)");
                    String userResponse = scanner.next();
                    if(!userResponse.equalsIgnoreCase("y")){
                        anotherGrade = false;
                    }
                }   while (anotherGrade);
        }
    }

