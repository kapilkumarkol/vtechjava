import java.sql.*;

import java.util.Scanner;

class A {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

        String query = "update students set school=?, contact=? where student_id=?";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setString(1, "Jhonson School");
        pst.setString(2, "5555555555");

        pst.setInt(3, 7);

        pst.executeUpdate();

        con.close();
    }
}