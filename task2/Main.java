package com.mycompany.task2;

/*@author Fikri*/
public class Main {
    
    public static void main(String[] args){
        Square kotak = new Square(15);
        System.out.println(kotak.toString());
        
        Circle lingkaran = new Circle(14);
        lingkaran.setColor("Green");
        System.out.println(lingkaran.toString());
    }
}
