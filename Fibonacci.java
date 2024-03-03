public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculate Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print Fibonacci sequence
        System.out.println("First 20 Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();

        // Calculate average
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += fibonacci[i];
        }
        double average = (double) sum / n;

        System.out.println("Average of the first 20 Fibonacci numbers: " + average);
    }
}
