package aup.cs;

public class Location {

    private int row;
    private int col;
    private double maxValue;

    public static void main(String[] args) {
        double[][] inputArray = getInputArray();
        Location loc = locateLargest(inputArray);
        System.out.println("The largest element is " + loc.getString());
    }

    private static double[][] getInputArray() {
        return new double[][] {
            {-1.4, -5.3, -9.3},
            {-5.1,-10.7,-6.1},
            {-1.0,0.0,-1.0}
        };
    }

    private static Location locateLargest(double[][] arr) {
        double maxCurrent = Double.NEGATIVE_INFINITY; // this value is smaller than anything in the array
        int rowCurrent = -1;
        int colCurrent = -1;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] > maxCurrent) {
                    maxCurrent = arr[i][j];
                    rowCurrent = i+1;
                    colCurrent = j+1;
                }
            }
        }
        return new Location(rowCurrent, colCurrent, maxCurrent);
    }

    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }

    public String getString() {
        return "Location (" + row + "," + col + ") of value " + maxValue;
    }
}