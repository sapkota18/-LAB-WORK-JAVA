import java.sql.*;

public class Display {
    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/College";
        String dbUser = "root";
        String dbPassword = "";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // SQL SELECT query
            String sql = "SELECT * FROM Info";

            // Create the PreparedStatement
            statement = connection.prepareStatement(sql);

            // Execute the query
            resultSet = statement.executeQuery();

            // Print the results
            System.out.println("RollNo\tName\t\tAddress");
            System.out.println("-----------------------------------");
            while (resultSet.next()) {
                int rollno = resultSet.getInt("rollno");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                System.out.println(rollno + "\t" + name + "\t\t" + address);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
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
    }
}


