package com.haroffcode.Exercises;

public abstract class Shapes implements ShapeInterface {
    public abstract double Area();
    public void toStringShape(){
        System.out.println("This is coming from shapes class");
    }
}
