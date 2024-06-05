import java.sql.*;
import java.util.Scanner;

public class StudentOperation {
    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/College";
        String dbUser = "root";
        String dbPassword = "";

        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Asking for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Loop through the number of students
            for (int i = 0; i < numStudents; i++) {
                // Taking user input for each student
                System.out.print("Enter roll number: ");
                int rollno = scanner.nextInt();
                scanner.nextLine();  // Consume newline left-over
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter address: ");
                String address = scanner.nextLine();

                // SQL INSERT query
                String sql = "INSERT INTO Info (rollno, name, address) VALUES (?, ?, ?)";

                // Create the PreparedStatement
                statement = connection.prepareStatement(sql);
                statement.setInt(1, rollno);
                statement.setString(2, name);
                statement.setString(3, address);

                // Execute the query
                int rows = statement.executeUpdate();

                if (rows > 0) {
                    System.out.println("Student " + (i + 1) + " has been inserted successfully.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        // Close the scanner
        scanner.close();
    }
}

