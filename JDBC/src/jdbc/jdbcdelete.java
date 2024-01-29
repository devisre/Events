package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcdelete {

	public static void main(String[] args) throws SQLException {
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","sreepriya1357");
        PreparedStatement stm=obj.prepareStatement("delete from employees where empid=?");
        stm.setString(1,"A172");
        stm.setString(2,"A62");
        stm.executeUpdate();
        
	}

}

