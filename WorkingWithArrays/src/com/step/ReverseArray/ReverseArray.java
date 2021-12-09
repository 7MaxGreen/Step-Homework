package com.step.ReverseArray;

public class ReverseArray {

    public int[] Sort(int[]array){

            for (int i = 0, temp, j = array.length-1; i < array.length / 2 ; i++, j--) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        return array;
        }
    }

