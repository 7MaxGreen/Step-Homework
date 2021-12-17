package com.step.Shapes;

import com.step.MyScanner.MyScanner;

public class Circle extends GeometricCalculator {

   private double radius;

    public Circle(String color){
        super(color);
    }

    public void setRadius() {
        System.out.println("Input radius of the circle: ");
        this.radius = MyScanner.sc.nextDouble();
    }

    public double getRadius() {
        return radius;
    }

    public String getColor(){
        return super.getColor();
    }

    @Override
    public double areaCalc() {
        return (radius * radius) * 3.14;
    }

    @Override
    public double perimeterCalc() {
        return 2*3.14*radius;
    }
}
