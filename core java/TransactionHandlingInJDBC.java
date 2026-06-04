import java.sql.*;

public class TransactionHandlingInJDBC {

    public static void main(String[] args) {

        try {

            Connection con =DriverManager.getConnection( "jdbc:mysql://localhost:3306/college", "root","root");

            con.setAutoCommit(false);

            PreparedStatement debit =
                con.prepareStatement(
                "UPDATE accounts SET balance=balance-? WHERE account_no=?");

            debit.setInt(1, 1000);
            debit.setInt(2, 101);

            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance=balance+? WHERE account_no=?");

            credit.setInt(1, 1000);
            credit.setInt(2, 102);

            debit.executeUpdate();
            credit.executeUpdate();

            con.commit();

            System.out.println("Transfer Success");

        } catch (Exception e) {
            System.out.println("Transfer Failed");
        }
    }
}