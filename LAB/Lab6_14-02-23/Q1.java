
/*1. Write a program in Java to define a class Number with appropriate data members and
member functions to input n number of integers and swap the biggest and smallest
elements. Use member functions read(), swap() and display(). */
import java.util.*;

class Number {
    int n;
    int a[];

    Number() {
        n = 0;
        a = new int[10];
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
    }

    void swap() {
        int max = a[0], min = a[0], pos1 = 0, pos2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                pos1 = i;
            }
            if (a[i] < min) {
                min = a[i];
                pos2 = i;
            }
        }
        a[pos1] = min;
        a[pos2] = max;
        System.out.println("After swapping");
    }

    void display() {
        System.out.println("The elements are : ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        }
}

class Q1 {
    public static void main(String args[]) {
        Number obj = new Number();
        obj.read();
        obj.display();
        obj.swap();
        obj.display();
    }
}
