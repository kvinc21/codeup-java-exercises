package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {

        protected int length;
        protected int width;

        public Rectangle(double width, double length) {
            super(length, width);
        }

        @Override
        public double getArea() {
            return this.length * this.width;
        }

        @Override
        public double getPerimeter() {
            return (2 * this.length) + (2 * this.width);
        }

        public void setLength(double length){
            this.length = (int) length;
        }

        public void setWidth(double width){
            this.width = (int) width;
        }



    }