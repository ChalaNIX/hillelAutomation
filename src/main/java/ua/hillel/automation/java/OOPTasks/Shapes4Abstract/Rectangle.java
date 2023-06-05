package ua.hillel.automation.java.OOPTasks.Shapes4Abstract;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }
    @Override
    public double  calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return length+width;
    }

}
