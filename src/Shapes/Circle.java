package Shapes;

public class Circle {

    private double radius;

    private static int count = 0;

    public Circle(double radius){
        this.radius = radius;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

}
