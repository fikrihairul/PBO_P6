package com.mycompany.task1;

/*@author Fikri*/
public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    
    public Circle(double r, String color) { // 2nd constructor
        radius = r;
        color = "red";
    }

    /** Returns the radius */
    public double getRadius() {
        return radius; 
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}
