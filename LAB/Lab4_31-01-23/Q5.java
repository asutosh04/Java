/*Exp 5.- Write a program to convert a binary numbers to decimal number and vice-versa. */

import java.util.*;

class Q5{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            String binaryString = Integer.toBinaryString(decimal);
            System.out.println("Binary : " + binaryString);
        }
    }
}

// import java.util.Scanner;

// class Q{
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             System.out.print("Enter a binary number : ");
//             String s=scanner.nextLine();
//             int n=s.length();
//             int i=0;
//             int sum=0;
//             while(i<n)
//             {
//                 int a=Integer.parseInt(s.substring(i,i+1));
//                 sum=sum+a*(int)Math.pow(2,n-i-1);
//                 i++;
//             }
//             System.out.println("Decimal number is "+sum);
//         }
//     }
// }