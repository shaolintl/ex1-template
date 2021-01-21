package aup.cs;

public class Test {

    public static void main(String[] args) {

        int[][] myInts = initProblem();
        
        System.out.println(toString2DimensionalArray(myInts));

        randomizeArray(myInts);

        System.out.println("After manipulation");
        System.out.println(toString2DimensionalArray(myInts));
    }

    private static int[][] initProblem() {
        return new int[10][9];
    }

    private static String toString2DimensionalArray(int[][] arr) {
        String ret = "";
        for (int i=0; i<arr.length; i++) {
            ret += java.util.Arrays.toString(arr[i]);
            ret += "\n";
        }
        return ret;
    }

    private static void randomizeArray(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 1000);
            }
        }
    }
}