package com.step.ArraySum;

public class ArraySum {

    public void sum(int[] array) {
        int sum = 0;

        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of the array's elements is : " + sum);
    }
}
