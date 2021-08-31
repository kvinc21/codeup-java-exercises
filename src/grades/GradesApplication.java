
package grades;

import util.Input;

import java.util.HashMap;


public class GradesApplication {
    public static Input input = new Input();
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

        Student studentOne = new Student("Timmy");
        studentOne.addGrade(99);
        studentOne.addGrade(87);
        studentOne.addGrade(84);

        Student studentTwo = new Student("Su");
        studentTwo.addGrade(91);
        studentTwo.addGrade(82);
        studentTwo.addGrade(94);

        Student studentThree = new Student("Steve");
        studentThree.addGrade(71);
        studentThree.addGrade(81);
        studentThree.addGrade(97);
    }

    public static void commandLineInterface(HashMap<String, Student> students){
        System.out.println("Welcome!\n " + "Here are the GitHub usernames of our students: ");

        do{
            for (String key : students.keySet()){
                System.out.print("|" + key + "| \n");
            }
            System.out.println("What student would you like to see mor information on? ");

            String userKey = input.getString();

            if (students.containsKey(userKey)){
                Student currentStudent = students.get(userKey);

                System.out.println("Sorry, no student found with the GitHub username of " + userKey);
            }
            System.out.println("Would you like to see another student?");
        } while (input.yesNo());
        System.out.println("Goodbye, and have a wonderful day!");

    }
}
