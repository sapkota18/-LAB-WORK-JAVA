import java.util.Arrays;

public class CitySorting {
    public static void main(String[] args) {
        String[] cities = {"Kathmandu", "Narayanghat", "Butwal", "Bhaktapur", "Patan"};
        Arrays.sort(cities);
        System.out.println("Cities in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

