


public class dynamicarray {
    public static void main(String[] args) {
        int[][] myNumbers = new int[2][];
        myNumbers[0] = new int[] { 1, 2, 3, 4 };
        myNumbers[1] = new int[] { 5, 6, 7 };

        for (int[] i : myNumbers) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}