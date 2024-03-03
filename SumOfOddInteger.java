import java.util.Scanner;

public class SumOfOddInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, s = 0;
        System.out.print("Enter Size of Array: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter the Array Element:");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) {
                s = s + arr[i];
            }
            sc.close();
        }
        System.out.print("Sum of Odd Integer is: " + s);
    }
}
