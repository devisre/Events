package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcinsert{

	public static void main(String[] args) throws SQLException {
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","sreepriya1357");
		PreparedStatement st=obj.prepareStatement("insert into employees values(?,?,?,?,?,?)");
		st.setString(1,"A172");
		st.setString(2,"gopal");
		st.setString(3, "Tester");
		st.setString(4,"Kollam");
		st.setInt(5, 59000);
		st.setString(6,"ammu@gmail.com");
		st.executeUpdate();
	} 

}
