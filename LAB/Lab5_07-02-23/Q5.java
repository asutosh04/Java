/*5. Write a program in Java to define a class Rectangle having data member: length, breadth
and class Calculate. Calculate class having data member area() and perimeter() to compute
the area and perimeter of the rectangle respectively. Also implement the application class
DemoRect where an object of the Rectangle class is created with user entered length and
breadth. */

import java.util.*;
class rectangle{
    int length, breadth;
    class calculate{
        void area(){
            double area=length*breadth;
            System.out.println("Area of the rectangle is: "+area);
        }
        void perimeter(){
            double perimeter=2*(length+breadth);
            System.out.println("Perimeter of the rectangle is: "+perimeter);
        }
    }
}

class demorect{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            //creation of object of class "rectangle"
            rectangle r=new rectangle();
            System.out.print("Enter the length: ");
            r.length=sc.nextInt();
            System.out.print("Enter the breadth: ");
            r.breadth=sc.nextInt();
            //creation of object of the nested class "Calculate" which is inside class "rectangle"
            rectangle.calculate c=r.new calculate();
            c.area();
            c.perimeter();
        }
    }
}