package edu.step.manager.controllers;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}

class Main{
    public static void main(String[] args) {

        useCalculator(new Calculator(){
            public int sum(int a, int b) {
                System.out.println("Welcome user");
                return a + b;
            }
        }, 2, 2);
    }

    public static void useCalculator(Calculator calculator, int a, int b){
        System.out.println(calculator.sum(a,b));
    }
}
