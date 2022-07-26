package com.vertafore.takehome;
import java.util.*;

public class QuestionOne {

    /*

        This function takes an array and scrambles the values then returns
        the scrambled array. If the array is only two values it simply swaps the two values.


        Uses an implementation of fisher-yates shuffle.
        Alternative is to use shuffle method from collections class as well.

        An IllegalArgumentException is thrown if the provided array is empty.

        Params: int[]
        Output: int[]

     */
    public static int[] scrambleArray(int[] original){
        //takes priv array
        Random random = new Random();
        if(original.length == 0){
            throw new IllegalArgumentException("array must have at least one value");
        }
        if(original.length == 2){
            swap(original, 0, 1);
        }
        for(int i = original.length - 1; i > 0; i--){
            int ran = random.nextInt(i+1);
            swap(original, i, ran);
        }

        return original;
    }

    public static void swap(int[] inp, int x, int y){
        int temp = inp[x];

        inp[x] = inp[y];
        inp[y] = temp;
    }

    public static void main(String[] args){


        int test[] = {7, 13, 13, 18, 29, 33};
        int testTwo[] = {1,3};
        int testThree[] = {1, 5, 9};

        int testNull[] = {};


        System.out.println(Arrays.toString(scrambleArray(test)));
        System.out.println(Arrays.toString(scrambleArray(testTwo)));
        System.out.println(Arrays.toString(scrambleArray(testThree)));

        //System.out.println(Arrays.toString(scrambleArray(testNull)));
    }
}
