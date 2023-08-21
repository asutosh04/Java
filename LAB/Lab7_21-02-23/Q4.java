/*4. Write a program to use a class Account with the following specifications:
Class name — Account
Data members — int accno, float balance
Member Methods:
1. Account (int a, int b) — to initialize accno = a, balance = b
2. void withdraw(int w) — to maintain the balance with withdrawal (balance - w)
3. void deposit(int d) — to maintain the balance with the deposit (balance + d)
Use another class Calculate which inherits from class Account with the following
specifications:
Data members — int r,t ; float si,amt;
Member Methods:

1. void accept(int x, int y) — to initialize r=x,t=y,amt=0
2. void compute() — to find simple interest and amount
si = (balance * r * t) / 100;
a = a + si;
3. void display() — to print account number, balance, interest and amount */

import java.util.Scanner;

class Account {
    int accno;
    float balance;

    Account(int a, int b) {
        accno = a;
        balance = b;
    }

    void withdraw(int w) {
        balance = balance - w;
        System.out.println("Balance after withdrawal: " + balance);
    }

    void deposit(int d) {
        balance = balance + d;
        System.out.println("Balance after deposit: " + balance);
    }
}

class Calculate extends Account {
    int r, t;
    float si, amt;

    Calculate(int a, int b, int x, int y) {
        super(a, b);
        r = x;
        t = y;
        amt = 0;
    }

    void compute() {
        si = (balance * r * t) / 100;
        amt = amt + si;
    }

    void display() {
        System.out.println("Account Number: " + accno);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + si);
        System.out.println("Amount: " + amt);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accno = sc.nextInt();
        System.out.print("Enter the balance: ");
        int balance = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = sc.nextInt();
        System.out.print("Enter the time: ");
        int t = sc.nextInt();
        
        Calculate c = new Calculate(accno, balance, r, t);
        c.withdraw(100);
        c.deposit(200);
        c.compute();
        c.display();
    }
}