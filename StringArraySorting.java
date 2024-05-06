import java.util.Arrays;

public class StringArraySorting {
    public static void main(String[] args) {
        String[] array = {"banana", "apple", "orange", "grape", "kiwi"};
        
        System.out.println("Original array: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

