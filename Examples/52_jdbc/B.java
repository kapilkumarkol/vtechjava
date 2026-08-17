import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class A {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?user=root&password=1234");

            String query = "insert into students (name, school, contact) value ('om', 'abc school', '7898579690')";

            PreparedStatement pst = con.prepareStatement(query);

            int val = pst.executeUpdate();

            System.out.println(val);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}