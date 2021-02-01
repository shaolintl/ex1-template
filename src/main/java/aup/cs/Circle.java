package aup.cs;

class Circle {
    private double axe;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println(c1.getRadius());
    }

    public double getRadius() {
        return axe;
    }

    public void setRadius(double r) {
        axe = r;
    }
}