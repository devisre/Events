package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcupdate {

	public static void main(String[] args) throws SQLException {
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","sreepriya1357");
		PreparedStatement stm=obj.prepareStatement("update employees set name=? where empid=?");
		stm.setString(1,"balu");
		stm.setString(2,"A172");
		 stm.executeUpdate();
	}

}
