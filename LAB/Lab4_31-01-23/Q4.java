/*Exp 4.- Write a program to generate a of random numbers between 1 and 6. */

class Q4 {
    public static void main(String[] args) {
        int randarray = (int) (10 * Math.random() % 6) + 1;
        System.out.println("Random number between 1 and 6: " + randarray);
    }
}
