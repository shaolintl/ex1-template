package aup.cs;

public class Circle {
    double radius;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 4.5;
        Circle c2 = new Circle();
        c2.radius = 40.3;
        System.out.println("Circle 1 has an area of " + c1.computeArea());
        System.out.println("Circle 2 has an area of " + c2.computeArea());
    }

    double computeArea() {
        return Math.PI * Math.pow(radius,2);
    }

}