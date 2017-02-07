package edu.tomer.java;

/**
 * Created by Android2017 on 31/01/2017.
 */
public class Matrices {


    public static int[] firstDiagonal(int[][] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i][i];
        }
        return result;
    }

    public static int[] secondDiagonal(int[][] arr){
        int[] result = new int[arr.length];
        for (int row = 0, col = arr.length - 1; row < arr.length; row++, col--) {
            result[row] = arr[row][col];
        }
        return result;
    }

    public static int[][] transpose(int[][] arr){
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            //arr[i][i] = arr[i][j];
            //temp = x
            int temp = arr[i][i];
            //x = y
            arr[i][i] = arr[i][j];
            //y = temp
            arr[i][j] = temp;
        }
        return arr;
    }
}