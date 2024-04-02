// lab no.26
public class ExceptionDemo {

    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }

        // Demonstrating NumberFormatException
        String numStr = "abc";
        try {
            int num = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }
}
