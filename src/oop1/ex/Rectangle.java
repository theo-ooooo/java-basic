package oop1.ex;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        int area = width * height;
        System.out.println("넓이 : " + area);
        return area;
    }
    int calculatePerimeter() {
        int perimeter = 2* (width + height);
        System.out.println("둘레 길이 :" + perimeter);
        return perimeter;
    }
    boolean isSquare() {
        boolean isSqure = width == height;
        System.out.println("정사각형 여부 :" + isSqure);
        return isSqure;
    }
}
