package aup.cs;

public class Circle {
    double radius;

    public static void main(String[] args) {
        Circle c1 = new Circle(4.5);
        Circle c2 = new Circle();
        c2.radius = 31;
        System.out.println("Circle 1 has an area of " + c1.computeArea());
        System.out.println("Circle 2 has an area of " + c2.computeArea());

        Circle.radius;
    }

    Circle(double rad) {
        radius = rad;
    }

    Circle() {
        radius = 1.0;
    }
    double computeArea() {
        return Math.PI * Math.pow(radius,2);
    }

}