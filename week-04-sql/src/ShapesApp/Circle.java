package ShapesApp;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void describe() {
        System.out.println("This is a Circle with radius " + radius);
    }
}
