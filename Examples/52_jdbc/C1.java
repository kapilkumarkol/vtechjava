import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class A {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?user=root&password=1234");

            String query = "insert into students (name, school, contact) value (?, ?, ?)";

            System.out.println(query);
            
            PreparedStatement pst = con.prepareStatement(query);

            System.out.println(pst);
            
            pst.setString(1, args[0]);
            pst.setString(2, args[1]);
            pst.setString(3, args[2]);
            
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            System.out.println(pst);

            int val = pst.executeUpdate();

            System.out.println(val);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}