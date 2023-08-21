/*2. Write a program in java to define a class Shape which has data member 'area' and a
member function showArea(). Derive two classes Circle and Rectangle from Shape class. Add
appropriate data members and member functions to calculate and display the area of Circle
and Rectangle. [Use abstract class]. */

import java.util.Scanner;

abstract class Shape {
    double area;
    abstract void showArea();
}

class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void showArea() {
        area = 3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void showArea() {
        area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle r = new Rectangle(length, breadth);
        c.showArea();
        r.showArea();
    }
}