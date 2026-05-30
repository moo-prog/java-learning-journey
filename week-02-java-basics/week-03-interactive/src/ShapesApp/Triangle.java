package ShapesApp;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height){
        this.base= base;
        this.height= height;
    }
    @Override
    public double area(){
        return (base * height)/2;
    }
    @Override
    public void describe() {
        System.out.println("This is a Triangle with base " + base + " and height " + height);
    }    }

