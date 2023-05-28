/*2. Accept 10 numbers from command line and check how many of them are even and how
many odd. */

import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        int i,even=0,odd=0;
        System.out.println("Enter 10 numbers : ");
        for(i=0;i<10;i++)
        {
            Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                if(n%2==0)
                    even++;
                else
                    odd++;
            
        }
        System.out.println("Even numbers = "+even);
        System.out.println("Odd numbers = "+odd);
    }
}
