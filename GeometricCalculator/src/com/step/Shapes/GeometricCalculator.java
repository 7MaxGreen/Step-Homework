package com.step.Shapes;

public abstract class GeometricCalculator {

    private String color;

    abstract double areaCalc();

    abstract double perimeterCalc();

    public GeometricCalculator( String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
