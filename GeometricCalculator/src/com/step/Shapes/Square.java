package com.step.Shapes;
import com.step.MyScanner.MyScanner;

public class Square extends GeometricCalculator {

    private double side;

    public Square( String color) {
        super(color);
    }

    public void setSide() {
        System.out.println("Input side length of the square: ");
        this.side = MyScanner.sc.nextDouble();
    }

    public double getSide() {
        return side;
    }

    public String getColor(){ return super.getColor();}

    @Override
    public double areaCalc() {
        return side*side;
    }

    @Override
    public double perimeterCalc() {
        return side * 4;
    }

}


