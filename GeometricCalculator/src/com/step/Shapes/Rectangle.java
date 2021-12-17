package com.step.Shapes;

import com.step.MyScanner.MyScanner;

public class Rectangle extends GeometricCalculator {

    private double length;
    private double width;

    public Rectangle( String color) {
        super(color);
    }

    public void setLength() {
        System.out.println("Input length of the rectangle: ");
        this.length = MyScanner.sc.nextDouble();
    }

    public void setWidth() {
        System.out.println("Input width of the rectangle: ");
        this.width = MyScanner.sc.nextDouble();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColor(){return super.getColor();}

    @Override
    public double areaCalc() {
        return length * width;
    }

    @Override
    public double perimeterCalc() {
        return (2*length) + (2*width);
    }

}
