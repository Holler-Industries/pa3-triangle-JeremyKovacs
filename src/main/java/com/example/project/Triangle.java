package com.example.project;
import java.lang.Math;

public class Triangle {

    // your code goes here: good luck =)
    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }

    public Triangle(double x0, double y0, double x1, double y1, double x2, double y2){
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Triangle(){
        x0 = 0;
        y0 = 0;
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    public double getPerimeter(){
        double a = Math.sqrt(Math.pow(x1-x0,2)+Math.pow(y1-y0,2));
        double b = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double c = Math.sqrt(Math.pow(x0-x2,2)+Math.pow(y0-y2,2));
        double Perimeter = a + b + c;
        return Perimeter;
    }

    public double getArea(){
        double a = Math.sqrt(Math.pow(x1-x0,2)+Math.pow(y1-y0,2));
        double b = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double c = Math.sqrt(Math.pow(x0-x2,2)+Math.pow(y0-y2,2));
        double s = (a+b+c)/2;
        double Area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        return Area;
    }

    public void translateX(double x){
        x0 = x0 + x;
        x1 = x1 + x;
        x2 = x2 +x;
    }

    public void translateY(double y){
        y0 = y0 + y;
        y1 = y1 + y;
        y2 = y2 + y;
    }

    public double getSide(int a, int b){
        double x = 0;
        double y = 0;
        double xx = 0;
        double yy = 0;
        if (a == 0){
            x = x0;
            y = y0;
        }
        if (a == 1){
            x = x1;
            y = y1;
        }
        if (a == 2){
            x = x2;
            y = y2;
        }
        if (b == 0){
            xx = x0;
            yy = y0;
        }
        if (b == 1){
            xx = x1;
            yy = y1;
        }
        if (b == 2){
            xx = x2;
            yy = y2;
        }
        double Side = Math.sqrt(Math.pow(xx-x,2)+Math.pow(yy-y,2));
        return Side;
    }

}
