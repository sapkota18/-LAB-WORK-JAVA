import java.util.Scanner;

public class MethodOverloading {
    void area(int r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    void area(int l, int b) {
        System.out.print("Area of Rectangle: " + (l * b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();  
        Scanner scanner = new Scanner(System.in);
        int length, breadth, radius;
        System.out.println("Enter radius of circle:");
        radius = scanner.nextInt();
        obj.area(radius);
        System.out.println("Enter length and breadth of rectangle:");
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        obj.area(length, breadth);
        scanner.close();
        
    }
}
