package aup.cs;

class Circle {

    private double radius;
    private static int numberOfObjects = 0;
    
    public static void main(String[] args) {
        Circle[] circles = getCircles();
        String value = displayCirclesArea(circles);
        System.out.println("The total area is " + value);
        System.out.println("The number of circles is " + Circle.getNumberOfObjects());
    }

    private static Circle[] getCircles() {
        return new Circle[] {
            new Circle(5.0),
            new Circle(2.0),
            new Circle(-3.0),
            new Circle(121.0),
            new Circle(122.34)
        };
    }

    private static String displayCirclesArea(Circle[] circles) {
        double acc = 0.0;
        int i;
        for (i=0; i<circles.length; i++) {
            acc += circles[i].getArea();
        }
        return "" + acc + " of " + i + " circles";
    }

    public Circle() {
        this(0.0);
    }

    public Circle(double radius) {
        numberOfObjects++;
        this.radius = radius;
    }

    public double getRadius() {
        // check permissions
        return radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}