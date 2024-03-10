import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        String s;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        s = scanner.next();
        scanner.close(); // Closing the scanner

        if (s.length() != 1) {
            System.out.println("Invalid Input");
        } else {
            ch = s.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // Simplified check for vowel using String.contains() method
                if ("AEIOUaeiou".contains(String.valueOf(ch))) {
                    System.out.println(ch + " is a Vowel");
                } else {
                    System.out.println(ch + " is a Consonant");
                }
            } else {
                System.out.println("Invalid Input ");
            }
        }
    }
}
