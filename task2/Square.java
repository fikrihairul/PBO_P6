package com.mycompany.task2;

/*@author Fikri*/
public class Square extends Rectangle{
    
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side,side);
    }
    
    public Square(double side, String Color, boolean Filled){
        super(side, side, Color, Filled);
    }
    
    public void getSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth( double Side){
        getSide(Side);
    }
    
    public void setLength( double Side){
        getSide(Side);
    }
    
    public String toString() {
        return "Square[Shape[Color = " + this.getColor() 
                + ",Filled = " + this.isFilled()
                + ", Width " + this.getWidth() 
                + "Length = " + this.getLength() + "]" +"]";
    }
}
