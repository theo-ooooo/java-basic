package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean rectangleSquare = rectangle.isSquare();
    }
}
