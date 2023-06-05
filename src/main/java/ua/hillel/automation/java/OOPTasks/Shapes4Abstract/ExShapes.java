package ua.hillel.automation.java.OOPTasks.Shapes4Abstract;

public class ExShapes {
    public static void main(String[] args) {
        //circle
        Circle circle = new Circle(3);
        System.out.println("Circle");
        System.out.println("Area of circle: "+circle.calculateArea());
        System.out.println("Perimeter of circle: "+circle.calculatePerimeter());
        //rectangle
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Rectangle");
        System.out.println("Area of rectangle: "+rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: "+rectangle.calculatePerimeter());
        //triangle
        Triangle triangle = new Triangle(2,4,3);
        System.out.println("Triangle");
        System.out.println("Area of triangle: "+triangle.calculateArea());
        System.out.println("Perimeter of triangle: "+triangle.calculatePerimeter());

    }
}
