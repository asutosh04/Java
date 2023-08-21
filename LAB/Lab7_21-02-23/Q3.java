/*3. Illustrate the execution of constructors in multi-level inheritance with three Java classes –
plate(int length, int width), box(length, width, height), wood box (length, width, height,
thick).
Hints:
Class plate{
Int length, width;
Plate(int a, int b){
Length= a;
Width=b;
}
}
Class box extends plate{
Int length, width, hight;
box(int a, int b, int c){
super(a,b);
hight=c;
}
} */

import java.util.*;

class plate {
    int length, width;
    plate(int a, int b) {
        length = a;
        width = b;
        System.out.println("Plate : Length: " + length + " Width: " + width);
    }
}

class box extends plate{
    int height;
    box(int a, int b, int c) {
        super(a, b);
        height = c;
        System.out.println("Box : Length: " + length + " Width: " + width + " Height: " + height);
    }
}

class woodbox extends box {
    int thick;
    woodbox(int a, int b, int c, int d) {
        super(a, b, c);
        thick = d;
        System.out.println("Woodbox : Length: " + length + " Width: " + width + " Height: " + height + " Thickness: " + thick);
    } 
    
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and width of the plate: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.print("Enter the height of the box: ");
        int height = sc.nextInt();
        System.out.print("Enter the thickness of the wood box: ");
        int thick = sc.nextInt();
        woodbox wb = new woodbox(length,width,height,thick);
    }
}