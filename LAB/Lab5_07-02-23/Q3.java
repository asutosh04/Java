/*3. Write a program to calculate area according to user input, whether it is circle, square or
triangle (Menu Driven). [Hints: Use switch case] */

import java.util.*;

class Q3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int ch;
            while (true) {
                System.out.println("------Area------");
                System.out.println("1.Circle");
                System.out.println("2.Square");
                System.out.println("3.Triangle");
                System.out.println("0.Exit");
                System.out.print("Enter your choice : ");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter the radius: ");
                        double r = sc.nextDouble();
                        System.out.println("Area of circle is: " + (3.14 * r * r));
                        break;
                    case 2:
                        System.out.print("Enter the side: ");
                        double s = sc.nextDouble();
                        System.out.println("Area of square is: " + (s * s));
                        break;
                    case 3:
                        System.out.print("Enter the base: ");
                        double b = sc.nextDouble();
                        System.out.print("Enter the height: ");
                        double h = sc.nextDouble();
                        System.out.println("Area of triangle is: " + (0.5 * b * h));
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Invalid shape");
                }
            }
        }
    }
}
