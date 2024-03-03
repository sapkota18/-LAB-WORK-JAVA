public class JaggedArraySUm {
    public static void main(String[] args) {
        // Initialize a jagged array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Display elements of the jagged array and calculate the sum of each row
        System.out.println("Jagged Array Elements with Row Sum:");
        for (int i = 0; i < jaggedArray.length; i++) {
            int rowSum = 0; // Initialize sum for current row
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                rowSum += jaggedArray[i][j]; // Add current element to row sum
            }
            System.out.println("- Row Sum: " + rowSum);
        }
    }
}
