/*5. Write a java program to compute the area of a rectangle using Java Inner class as
follows:
Class Rect{
    Length, width;
        Class RectArea{
            area(){
                Return area;
            }
        }
}
Class DemoMain{
….……………………
….………………..
} */

import java.util.Scanner;
class Rect{
    int length, width;
    class RectArea{
        int area(){
            return length*width;
        }
    }
}

class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect obj = new Rect();
        Rect.RectArea obj1 = obj.new RectArea();
        System.out.print("Enter the length: ");
        obj.length = sc.nextInt();
        System.out.print("Enter the width: ");
        obj.width = sc.nextInt();
        System.out.println("The area of the rectangle is: " + obj1.area());
    }
}
