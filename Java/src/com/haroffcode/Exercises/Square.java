package com.haroffcode.Exercises;

public class Square extends Shapes{
    protected int length;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public double Area(){
        return (double)(Math.pow(length, 2));
    }
    public void toStringShape(){
        System.out.println("This is from Square class");
    }
}
