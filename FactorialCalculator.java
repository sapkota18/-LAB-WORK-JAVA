import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }
}
