package ua.hillel.automation.java.OOPTasks.Shapes4Abstract;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double semiper = calculatePerimeter()/2;
        return Math.sqrt(semiper*(semiper-a)*(semiper-b)*(semiper-c));
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
