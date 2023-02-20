package com.Project2;

public interface Shape {

    void calculateArea();
    void calculatePerimeter();

}

class Circle implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("Calculate Area in Circle");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculate Perimeter in Circle");
    }
}

class Square implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("Calculate Area in Square");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculate Perimeter in Square");
    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();

    }

}