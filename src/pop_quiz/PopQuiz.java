package pop_quiz;

public class PopQuiz {

    public static double multiply( int a, int b) {
        return a * b;
    }

    public static double multiply(double y, double z){
        return y * z;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2,3));
        System.out.println(multiply(2.0,5.4));

        Duck steve;
        steve = new Duck("Steve", 25);

        Mallard joe;
        joe = new Mallard("Joe", 35);
        joe.quack();
        joe.getDetails();

    }

}


