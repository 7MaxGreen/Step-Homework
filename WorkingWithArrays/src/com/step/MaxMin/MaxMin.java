package com.step.MaxMin;

public class MaxMin {

    public void findValues(int[] array){

        int maxNr = array[0];
        int minNr = array[0];

        for(int i=1; i<array.length; i++){
            if(maxNr<array[i]) maxNr = array[i];
            if(minNr>array[i]) minNr = array[i];
        }

        System.out.println("Max number: " + maxNr);
        System.out.println("Min number: " + minNr);
    }
}
