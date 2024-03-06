import java.util.Scanner;

public class Area {
    double length, breadth;

    Area(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double returnarea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        double length, breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        length = scanner.nextDouble();
        breadth = scanner.nextDouble();
        Area rectangle = new Area(length, breadth);
        double area = rectangle.returnarea();
        System.out.println("The area of Rectangle:" + area);
        scanner.close();

    }
}
