import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your School Name: ");
        String college = sc.nextLine();
        
        System.out.println("Enter your contact: ");
        String mobile = sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?user=root&password=1234");

            String query = "insert into students (name, school, contact) value (?, ?, ?)";
            
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, name);
            pst.setString(2, college);
            pst.setString(3, mobile);
            
            int val = pst.executeUpdate();

            System.out.println(val);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}