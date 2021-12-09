package com.step.Calculator;

public class Calculator {

    public void addition(int a, int b){
        int result = a + b;
        System.out.println("a+b = " + result);
    }

    public void multiplication(int a, int b){
        int result = a * b;
        System.out.println("a*b = " + result);
    }

    public void subtraction(int a, int b){
        int result = a - b;
        System.out.println("a-b = " + result);
    }

    public void division(int a, int b){
        double result = a / (double) b;
        System.out.println("a/b = " + result);
    }

    // method overloading

    public void addition(double a, double b){
        double result = a + b;
        System.out.println("double a+b = " + result);
    }

    public void multiplication(double a, double b){
        double result = a * b;
        System.out.println("double a*b = " + result);
    }

    public void subtraction(double a, double b){
        double result = a - b;
        System.out.println("double a-b = " + result);
    }

    public void division(double a, double b){
        double result = a / b;
        System.out.println("double a/b = " + result);
    }
}
