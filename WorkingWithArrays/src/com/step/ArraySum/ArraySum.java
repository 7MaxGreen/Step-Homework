package com.step.ArraySum;
import java.util.Scanner;

public class ArraySum {

    public int sum(int[] array) {
        int sum = 0;

        System.out.print("Sum of the array's elements is : ");
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
