package Shapes;


public class Rectangle extends Quadrilateral implements Measurable {

    public class Rectangle {

        protected int length;
        protected int width;

        public Rectangle(double width, double length) {
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return this.length * this.width;
        }

        public double getPerimeter() {
            return (2 * this.length) + (2 * this.width);
        }


    }
}