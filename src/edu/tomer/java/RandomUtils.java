package edu.tomer.java;

import java.util.Random;

/**
 * Created by Android2017 on 07/02/2017.
 */
public class RandomUtils {
    static int[] nextRandomArray(int min, int max, int size){
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = nextRandom(min, max);
        }
        return result;
    }

    /**
     * next random between min and max
     * @param min the min value
     * @param max the max value
     * @return a random number from min to max
     */
    static int nextRandom(int min, int max){
        Random randGen = new Random();
        int diff = max - min;
        int rand = randGen.nextInt(diff + 1);
        return rand + min;
    }
    //line comment
    /*
    * MultiLine Comment
    * */


    /**
     * Next random between - n to +n
     * @param n the limit
     * @return a random number between  - n to +n
     */
    static int nextRandom(int n){
        Random randGen = new Random();
        int r = randGen.nextInt();//-int - int
        return r % (n + 1);
    }

}
