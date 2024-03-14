import java.util.Scanner;

 public class MyDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Distance d1 = new Distance(6, 7);
        Distance d2 = new Distance(8, 12);
        System.out.print(" press 1 for sum and 2 for Difference: ");
        choice = sc.nextInt();
        sc.close();
        if (choice == 1) {
            d1.addDistance(d2); // Pass the second distance object to add
            System.out.println("After Addition: ");
            d1.display();
        }
        if (choice == 2) {
            d1.subtractDistance(d2); // Pass the second distance object to subtract
            System.out.println("After Subtraction : ");
            d1.display();
        }
    }
}

   class Distance {

    private int feet;
    private int inches;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void addDistance(Distance d) {
        this.feet += d.feet;
        this.inches += d.inches;
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches %= 12;
        }
    }

    public void subtractDistance(Distance d) {
        int totalinches1 = this.feet * 12 + this.inches;
        int totalinches2 = d.feet * 12 + d.inches;
        int result = Math.abs(totalinches1 - totalinches2);
        this.feet = result / 12;
        this.inches = result % 12;
    }

    public void display() {
        System.out.println("Distance:" + " " + feet + " feet" + " " + inches + "inches");
    }

}
