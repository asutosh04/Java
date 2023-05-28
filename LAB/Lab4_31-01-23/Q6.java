/*Exp6.-Program to check a user entered number is palindrome or not. */
import java.util.*;
class Q6
{
    public static void main(String args[])
    {
        System.out.print("Enter a number : ");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int temp=n;
            int sum=0;
            while(n>0)
            {
                int a=n%10;
                sum=sum*10+a;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}