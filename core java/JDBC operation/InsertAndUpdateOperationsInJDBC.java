import java.sql.*;

public class InsertAndUpdateOperationsInJDBC {

    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root");

            // INSERT Operation
            String insertSql =
                    "INSERT INTO students(id,name,age) VALUES(?,?,?)";

            PreparedStatement ps1 =
                    con.prepareStatement(insertSql);

            ps1.setInt(1, 101);
            ps1.setString(2, "Rahul");
            ps1.setInt(3, 21);

            ps1.executeUpdate();
            System.out.println("Record Inserted");

            // UPDATE Operation
            String updateSql =
                    "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps2 =
                    con.prepareStatement(updateSql);

            ps2.setString(1, "Rahul Kumar");
            ps2.setInt(2, 101);

            ps2.executeUpdate();
            System.out.println("Record Updated");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
