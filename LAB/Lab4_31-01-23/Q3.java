/*Exp 3. Make program to makes a multiplication table as shown below.
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20 */

class Q3 {
    public static void main(String[] args) {
        int n = 1;
        while (n < 5) {
            for (int i = 1; i < 6; i++) {
                System.out.print(n * i + "\t");
            }
            System.out.print("\n");
            n++;
        }
    }
}