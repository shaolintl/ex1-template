package aup.cs;

public class Question8_4 {
    public static void main(String[] args) {
        int[][] employeeHours = readHours();  
        int[] totals = computeTotals(employeeHours);
        displayDescOrder(totals);   
    }

    static int[][] readHours() {
        return new int[][] {
            {1,2,3,4,5,6,7},
            {3,3,3,3,3,3,3},
            {4,4,2,2,7,1,3}
        };
    }

    static int[] computeTotals(int[][] arr) {
        int[] acc = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                acc[i] += arr[i][j];
            }
        }
        return acc;
    }

    static void displayDescOrder(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int currentMax = arr[0];
            int currentMaxIndex = 0;
            for (int j=1; j<arr.length; j++) {
                if (arr[j] > currentMax) {
                    currentMax = arr[j];
                    currentMaxIndex = j;
                } 
            }
            System.out.println("Employee " + (currentMaxIndex+1) + " has worked for a total of " + arr[currentMaxIndex] + " hours");
        }
    }
}