public class args {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println("The number of prime numbers in the input: " + count);
    }
    
    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}