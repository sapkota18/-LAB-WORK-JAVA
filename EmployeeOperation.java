import java.sql.*;
import java.util.Scanner;

public class EmployeeOperation {
    EmployeeOperation() {
        Connection conn = null;
        Scanner sc = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "");

            sc = new Scanner(System.in);
            System.out.print("Number of Employees: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                String sql = "INSERT INTO employee(EID, Ename, Salary, Department) VALUES (?,?,?,?)";
                PreparedStatement ptst = conn.prepareStatement(sql);

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();  // Consume newline
                System.out.print("Name: ");
                String Ename = sc.nextLine();
                System.out.print("Salary: ");
                int Salary = sc.nextInt();
                sc.nextLine();  // Consume newline
                System.out.print("Department: ");
                String Department = sc.nextLine();

                ptst.setInt(1, id);
                ptst.setString(2, Ename);
                ptst.setInt(3, Salary);
                ptst.setString(4, Department);

                ptst.executeUpdate();
                ptst.close();
            }

            String sql = "SELECT * FROM employee WHERE Department = 'sales'";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            System.out.println("EID\tNAME\tSalary\tDepartment");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (sc != null) sc.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new EmployeeOperation();
    }
}
