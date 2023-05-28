/*4. Write a class file – box with three data members (length, width, height) and a method
volume() . Also implement the application class Demo where an object of the box class is
created with user entered dimensions and volume is printed. */

import java.util.*;

class Box {
    int length, width, height;
    void volume() {
        double vol=length * width * height;
        System.out.println("Volume of the box is: " + vol);
    }
}
class demo{
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Box b = new Box();
            System.out.print("Enter the length: ");
            b.length = sc.nextInt();
            System.out.print("Enter the width: ");
            b.width = sc.nextInt();
            System.out.print("Enter the height: ");
            b.height = sc.nextInt();
            b.volume();
        }
    }
}


