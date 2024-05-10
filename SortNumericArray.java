import java.util.Arrays;
public class SortNumericArray {
    public static void main(String[] args) {
        int arr[]={0,4,8,45,6,23,21};
        System.out.println("Original Array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
