import java.util.Scanner;

public class FirstNPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the Number of terms: ");
        n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + ":");
        for (int num = 1; num <= n; num++) {
            int factorCount = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    factorCount++;
            }
            if (factorCount == 2) { // If no factors were found
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
