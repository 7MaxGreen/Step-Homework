package com.step.DisplayArray;
import com.step.Shapes.Circle;
import com.step.Shapes.Rectangle;
import com.step.Shapes.Square;

public class DisplayArray {
    public static void Display(String[] forms, Square square, Circle circle, Rectangle rectangle )
    {
        for(int i=0; i<forms.length; i++)
        {
            System.out.println();
            System.out.println(forms[i] + ":" );

            if (forms[i].equals("square")) {
                square.setSide();

                System.out.println("Square perimeter: "+ square.perimeterCalc());
                System.out.println("Square perimeter: "+ square.areaCalc());
                System.out.println("Color: " + square.getColor());
            }
            if( forms[i].equals("circle")){
                circle.setRadius();

                System.out.println("Circle perimeter: "+ circle.perimeterCalc());
                System.out.println("Circle area: " +  circle.areaCalc());
                System.out.println("Color: " + circle.getColor());
            }

            if( forms[i].equals("rectangle")){
                rectangle.setLength();
                rectangle.setWidth();

                System.out.println("Rectangle perimeter: "+ rectangle.perimeterCalc());
                System.out.println("Rectangle area: " +  rectangle.areaCalc());
                System.out.println("Color: " + rectangle.getColor());
            }
        }
    }
}
