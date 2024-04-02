import java.util.Scanner;

public class CollegeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your college name: ");
        String collegename = sc.nextLine();
        try {
            if (collegename.length() > 50) {
                throw new IllegalArgumentException("College name is more than fifty characters");
            } else {
                System.out.println("COLLEGE NAME: " + collegename);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {

            sc.close();
        }
    }
}
