package edu.tomer.java;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int result = RandomUtils.nextRandom(-5, 10);
            System.out.println(result);
        }
    }


    static void q10b(){
        int[] results = new int[84]; //0-83
        for (int i = 0; i < 672; i++) {
            int[] arr = new int[83];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = IO.getInt("Enter the next number:");
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
