package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","sreepriya1357");
		System.out.println("hello"+con);
		Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employees");
        while(rs.next()) {
        	System.out.println(rs.getString(2)+" "+rs.getString(1));
        }
        con.close();
	}
}