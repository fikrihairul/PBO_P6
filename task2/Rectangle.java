package com.mycompany.task2;

/*@author Fikri*/
public class Rectangle extends Shape{
    
    private double width;
    private double length;
    
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String Color, boolean Filled){
        super(Color, Filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth( double width){
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength( double length){
        this.length = length;
    }
    
    public double getArea() {
        return this.length*this.width;
    }
    
    public double getPerimeter() {
        return (2*this.width)+(2*this.length);
    }
    
    public String toString() {
        return "Rectangle[Shape[Color = " + this.getColor() 
                + ",Filled = " + this.isFilled() 
                + ", Width " + this.width 
                + "Length = " + this.length + "]" +"]";
    }
}
