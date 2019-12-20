package com.wxfx.simple;

public class Circle{
    double rad;
    final double PI;

    public Circle(double r){
        rad = r;
        PI = 3.14;
    }

    public double getPerimeter(){
        return (2 * rad) * PI;
    }
}