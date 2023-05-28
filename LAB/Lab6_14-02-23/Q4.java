
/*4. Write a java program to implement method overloading and constructors overloading.*/
import java.util.*;

class Overload {
    Overload() {
        System.out.println("Default Constructor is called");
    }

    Overload(int a) {
        System.out.println("Constructor with one parameter is called");
    }

    Overload(int a, int b) {
        System.out.println("Constructor with two parameters is called");
    }

    void add(int a, int b) {
        System.out.println("Addition of two numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Addition of three numbers: " + (a + b + c));
    }
}

class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Overload obj = new Overload();
        Overload obj1 = new Overload(1);
        Overload obj2 = new Overload(1, 2);
        System.out.println("Enter the number of numbers to be added: ");
        System.out.println("2. Two");
        System.out.println("3. Three");
        System.out.print("Enter the choice: ");
        int n = sc.nextInt();
        switch (n) {

            case 2:
                System.out.println("Enter the two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                obj.add(a, b);
                break;
            case 3:
                System.out.println("Enter the three numbers: ");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int c1 = sc.nextInt();
                obj1.add(a1, b1, c1);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
