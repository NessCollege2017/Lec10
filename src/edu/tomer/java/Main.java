package edu.tomer.java;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        q10b();
    }

    static boolean isZoher(int[][] arr, int k, int j, int num){
        //validate the input
        if (k + 2 >=arr.length || j + 2 >= arr[k].length)
            return false;

        int sum = 0;

        for (int row = k; row <= k+2; row++) {
            for (int col = j; col <= j + 2; col++) {
                sum+=arr[row][col];
            }
        }
        return sum > num;
    }

    static void q10b(){
        int[] results = new int[84]; //0-83
        for (int i = 0; i < 672; i++) {
            int[] arr = new int[83];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = RandomUtils.nextRandom(-10, 1);
            }

            int sCount = mofaShlili(arr);
            results[sCount]++;
        }

        for (int n = 1; n <= 83; n++) {
            System.out.println("n = " + n);
            System.out.println("num of mofaShlili = " + results[n]);
        }
        System.out.println("num of No mofaShlili = " + results[0]);
    }


    static int mofaShlili(int[] arr){
        int counter = 0;
        int position = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                position = i;
                break;
            }
        }

        while (position < arr.length && arr[position] < 0){
            counter++;
            position++;
        }
        return  counter;
    }
}
