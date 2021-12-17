package com.step;
import com.step.CreateArray.CreateArray;
import com.step.DisplayArray.DisplayArray;
import com.step.Shapes.Circle;
import com.step.Shapes.Rectangle;
import com.step.Shapes.Square;

public class Main {

    public static void main(String[] args) {

        CreateArray array = new CreateArray();

        String[] createdForms = array.createArray();

        Square square = new Square("red");

        Rectangle rectangle = new Rectangle("purple");

        Circle circle = new Circle("black");

        DisplayArray.Display(createdForms,  square,  circle,  rectangle);
    }
}
