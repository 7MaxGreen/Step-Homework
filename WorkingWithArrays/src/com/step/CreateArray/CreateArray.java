package com.step.CreateArray;
import java.util.Scanner;

public class CreateArray {
    Scanner sc = new Scanner(System.in);
    //Create an array of integer values;
    public int[] newArray(){

        System.out.print("Input your array length : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.print("Input your array elements : ");
        for(int i = 0; i<array.length; i++){
        array[i] = sc.nextInt();
        //System.out.println(array[i]);
        }
        return array;
    }

    //Create an array of char values;
    public char[] charArray(){
        //char c = sc.next().charAt(0);

        char[] array = new char[10];

        System.out.print("Input 10 char characters: ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.next().charAt(0);
        }
        return array;
    }

}
