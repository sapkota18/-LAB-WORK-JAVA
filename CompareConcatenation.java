import java.util.Scanner;

public class CompareConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first  String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String str2 = sc.nextLine();
        System.out.println("Comparison Follows As: ");
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("String 1 is lexicographically less than String 2");
        } else if (comparisonResult == 0) {
            System.out.println("String 1 is lexicographically equal to String 2");
        } else {
            System.out.println("String 1 is lexicographically greater than String 2");
        }
        System.out.println("Equality: " + str1.equals(str2));
        System.out.println("Concatenation: " + str1.concat(str2));
    }
}

