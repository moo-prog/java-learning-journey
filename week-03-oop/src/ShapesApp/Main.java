package ShapesApp;

public class Main {
    public static void main (String[] args){
        Shape[] shapes={
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8)
        };
        for (Shape s : shapes){
            s.area();
            s.describe();
        }

    }
}
