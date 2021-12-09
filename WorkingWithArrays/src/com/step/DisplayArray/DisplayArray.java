package com.step.DisplayArray;

public class DisplayArray {

    public void display(int[] arr){
        System.out.print("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void display(char[] arr){
        System.out.print("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
