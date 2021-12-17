package com.step.CreateArray;
import com.step.MyScanner.MyScanner;


public class CreateArray {

    public String[] createArray (){

    int j = 0;

    String[] forms = new String[3];

        System.out.println("Input shapes : ");

        while(j<3){
            for(int i=0; i<forms.length; i++){
                String input = MyScanner.sc.nextLine();

                if(input.equals("square") || input.equals("rectangle") || input.equals("circle")){
                    forms[i] = input ;
                    j++;
                }else {
                    System.out.println("Besides square, rectangle and circle no other shapes can be created"); }
            }
        }

        return forms;
    }
}
