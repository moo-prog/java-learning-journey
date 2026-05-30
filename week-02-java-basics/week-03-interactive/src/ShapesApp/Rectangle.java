package ShapesApp;

import static java.lang.Math.PI;

public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(double width,double length){
        this.width= width;
        this.length= length;
    }
    @Override
    public double area(){
        return width*length;
    }
    @Override
    public void describe() {
        System.out.println("This is a Rectangle with width " + width + " and height " + length);
    }
}
