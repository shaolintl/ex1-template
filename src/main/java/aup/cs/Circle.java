package aup.cs;

class Circle {

    private double radius;
    private int[] center;
    private static int numberOfObjects = 0;
    
    public static void main(String[] args) {
        Circle[] circles = getCircles();
        String value = displayCirclesArea(circles);
        System.out.println("The total area is " + value);
        System.out.println("The number of circles is " + Circle.getNumberOfObjects());
    }

    private static Circle[] getCircles() {
        Circle mostCommon = new Circle(10.0, new int[]{1,1,1});
        Circle common2 = new Circle(mostCommon);

        common2.getCenter()[1] = 7;

        return new Circle[] {
            new Circle(5.0, new int[]{1,1,13}),
            new Circle(2.0, new int[]{1,12,1}),
            new Circle(-3.0, new int[]{-13,1,1}),
            new Circle(121.0, new int[]{1,1,2}),
            common2,
            new Circle(mostCommon),
            new Circle(122.34, new int[]{1,50,1})
        };
    }

    private static String displayCirclesArea(Circle[] circles) {
        double acc = 0.0;
        int i;
        for (i=0; i<circles.length; i++) {
            acc += circles[i].getArea();
            System.out.println("DEBUG>>> Computing using circle of center "+ java.util.Arrays.toString(circles[i].getCenter()));
        }
        return "" + acc + " of " + i + " circles";
    }

    public Circle() {
        this(0.0,new int[]{0,0,0});
    }

    public Circle(double radius, int[] center) {
        numberOfObjects++;
        this.radius = radius;
        this.center = center;
    }

    /**
     * Deep copy constructor
     */
    public Circle(Circle c) {
        this(c.radius, java.util.Arrays.copyOf(c.center,c.center.length));
    }

    public double getRadius() {
        // check permissions
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int[] getCenter() {
        return center;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}