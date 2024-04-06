import java.util.Scanner;
public class DeleteCharAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        if (str.length() >= 4) {
            StringBuffer s = new StringBuffer(str);
            System.out.println("Character at index 3: " + str.charAt(3));
            s.deleteCharAt(3);
            System.out.println("String after deleting character at index 3: " + s.toString());
        } else {
            System.out.println("Input string should have at least 4 characters.");
        }
    }
}
