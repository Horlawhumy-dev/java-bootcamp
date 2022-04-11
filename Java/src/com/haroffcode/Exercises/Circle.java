package com.haroffcode.Exercises;

public class Circle extends Shapes{
    public int radius;
    private final double PI = Math.round(Math.PI);

    public int getRadius(){
       return radius;
    }

    public void setRadius(int r){
        this.radius = r;
    }

    public double Area(){
        return PI * Math.pow(radius, 2);
    }

    public void toStringShape(){
        System.out.println("This is from Circle class");
    }
}
