package com.step;
import com.step.CreateArray.CreateArray;
import com.step.ArraySum.ArraySum;
import com.step.MaxMin.MaxMin;
import com.step.ReverseArray.ReverseArray;
import com.step.FindLetter.FindLetter;
import com.step.Calculator.Calculator;
import com.step.DisplayArray.DisplayArray;


public class Main {

    public static void main(String[] args) {

        //Class for creating arrays (length and elements);
        CreateArray myArray = new CreateArray();

        //Class for display
        DisplayArray arrayDisplay = new DisplayArray();

        //returns an array of integer values;
        int[] intArray = myArray.newArray();
        arrayDisplay.display(intArray);

        //Class to calculate the sum of array's elements;
        ArraySum arraySum = new ArraySum();
        //returns the sum of integer elements;
        System.out.println(arraySum.sum(intArray));



        //Class that finds the maximum and minimum values from the array;
        MaxMin maxmin = new MaxMin();
        //prints the maximum and minimum values from intArray array;
        maxmin.findValues(intArray);


        //returns an array of char values;
        char[] charArray = myArray.charArray();
        arrayDisplay.display(charArray);
        //Class that prints vowel or consonants from the char array;
        FindLetter vowelOrConsonant = new FindLetter();
        //displays char input elements and its values( consonant or vowel)
        vowelOrConsonant.findL(charArray);


        //Class which reverse the array;
        ReverseArray reverse = new ReverseArray();
        int[] reversedArray = reverse.Sort(intArray);
        arrayDisplay.display(reversedArray);

        //Class Calculator with overloaded methods;
        Calculator calc = new Calculator();

        calc.addition(2, 3);
        calc.addition(2.3, 3.4);

        calc.subtraction(3, 4);
        calc.subtraction(3.3, 4.6);

        calc.multiplication(3, 4);
        calc.multiplication(3.5, 6.6);

        calc.division(9, 3);
        calc.division(3 , 9);

    }
}
