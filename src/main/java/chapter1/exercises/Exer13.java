package chapter1.exercises;

public class Exer13 {

    public static void main(String[] args) {

        int[][] arr = getArray(3, 4);
        printArray(arr); // test print

        System.out.println();

        arr = transposeArray(arr);
        printArray(arr); // print result
    }

    private static int[][] transposeArray(int[][] arr) {
        int[][] newArray = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArray[j][i] = arr[i][j];
            }
        }
        return newArray;
    }

    private static int[][] getArray(int a, int b) {
        int[][] arr = new int[a][b];
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = count++;
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
