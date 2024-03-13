import java.util.Scanner;

// Define a class Time
public class Time {
    // Attributes to store hours, minutes, and seconds
    int hh, mm, ss;

    // Constructor to initialize the attributes
    Time(int h, int m, int s) {
        hh = h;
        ss = s;
        mm = m;
    }

    // Method to add two Time objects
    Time add(Time t2) {
        // Add seconds
        ss = ss + t2.ss;
        // Add minutes
        mm = mm + t2.mm;
        // Add hours
        hh = hh + t2.hh;

        // Handle carryover if seconds exceed 60
        if (ss >= 60) {
            mm += ss / 60;
            ss = ss % 60;
        }

        // Handle carryover if minutes exceed 60
        if (mm >= 60) {
            hh += mm / 60;
            mm = mm % 60;
        }

        return this;
    }

    // Method to subtract two Time objects
    Time Subtract(Time t2) {
        // If the seconds of t2 are greater than current object's seconds, borrow from minutes
        if (t2.ss > ss) {
            --mm;
            ss += 60;
        }

        // Subtract seconds
        ss = ss - t2.ss;

        // If the minutes of t2 are greater than current object's minutes, borrow from hours
        if (t2.mm > mm) {
            --hh;
            mm += 60;
        }

        // Subtract minutes
        mm = mm - t2.mm;

        // Subtract hours
        hh = hh - t2.hh;

        return this;
    }

    // Method to display the time
    void display() {
        System.out.println("HH:MM:SS=" + hh + " : " + mm + " : " + ss);
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        // Create two Time objects with initial values
        Time t1 = new Time(6, 45, 67);
        Time t2 = new Time(5, 67, 34);

        // Display the two Time objects
        System.out.println("Two Time ARE:   ");
        t1.display();
        t2.display();

        // Prompt the user to choose operation (addition or subtraction)
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for sum and 2 for difference: ");
        int choice = sc.nextInt();
        sc.close();

        Time result;
        // Perform addition if user chooses 1
        if (choice == 1) {
            result = t1.add(t2);
            System.out.println("SUM is : ");
            result.display();
        }
        // Perform subtraction if user chooses 2
        else if (choice == 2) {
            result = t1.Subtract(t2);
            System.out.println("DIFFERENCE IS:  ");
            result.display();
        }
    }
}
