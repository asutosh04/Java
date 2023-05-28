/*1. Find the largest among 3 user entered nos. at the command prompt using Java. */

import java.util.*;
class Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter 3 nos.: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b && a>c)
                System.out.println("Largest no. is "+a);
            else if(b>a && b>c)
                System.out.println("Largest no. is "+b);
            else
                System.out.println("Largest no. is "+c);
    }
}
