package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class taskstudentsdetails {

	public static void main(String[] args) throws SQLException {
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/colleagedb","root","sreepriya1357");
		
		Scanner sc=new Scanner(System.in);
		
		String wish="no";
		
	do {
			
		System.out.println("Select your Option");
		System.out.println("1.Insert Students details");
		System.out.println("2.Edit students details");
		System.out.println("3.Delete students details ");
		System.out.println("4.Show students details");
		System.out.println("5.Show all students details");
		
		int name=sc.nextInt();
		 
		switch (name){
		
		case 1:{
			
			PreparedStatement st=obj.prepareStatement("insert into Students values(?,?,?,?,?,?)");
			
			System.out.println("Insert Students details");
			
            System.out.println("Enter id:");
            int b=sc.nextInt();
            st.setInt(1,b);
            
            System.out.println("Enter name:");
            String ab=sc.next();
            st.setString(2,ab);
            
            System.out.println("Enter class:");
            int c=sc.nextInt();
            st.setInt(3,c);
            
            System.out.println("Enter rollno:");
            int cd=sc.nextInt();
            st.setInt(4,cd);
            
            System.out.println("Enter phone number:");
            Long d=sc.nextLong();
            st.setLong(5,d);
            
            System.out.println("Enter mailid:");
            String de=sc.next();
            st.setString(6,de);
            
            st.executeUpdate();
            break; }
        
		
		case 2:{
			
		//	PreparedStatement st=obj.prepareStatement("update Students set phoneno=? where name=?");
		    System.out.println("Edit students details");
		    
			System.out.println("Enter phoneno:");
            Long b=sc.nextLong();
           
            System.out.println("Enter name:");
            String c=sc.next();
            
            PreparedStatement st=obj.prepareStatement("update Students set phno=? where name=?");
            st.setLong(1,b);
            st.setString(2,c);
            
            st.executeUpdate(); 
            break; }
            
		
		
		case 3: {
			
			
			PreparedStatement ps =obj.prepareStatement("delete from Students where id=?");
			
			System.out.println("Delete students details ");
			System.out.println("Student id:");
			int e=sc.nextInt();
			ps.setInt(1,e);
			
			ps.executeUpdate(); 
			break;  }
			
		
		
		case 4: {
			
			PreparedStatement Ps=obj.prepareStatement("select * from Students where id=? ");
			
			System.out.println("Show students details");
			int id=sc.nextInt();
			Ps.setInt(1,id);
			
			ResultSet rs=Ps.executeQuery();
	        while(rs.next()) {
		    System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3)+","+rs.getInt(4)+","+rs.getInt(5)+","+rs.getString(6));
		   
	        }
		    break; }
			
			   
		
		
		case 5: {
			
			PreparedStatement tm=obj.prepareStatement("select * from Students");
			
			ResultSet rs=tm.executeQuery("select * from Students");
			
			System.out.println("Show all students details");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3)+","+rs.getInt(4)+","+rs.getInt(5)+","+rs.getString(6));}
				
			//tm.executeUpdate();
			break;   }  
		}
		
		System.out.println("do you wish to continue Yes or No ?");
		 wish=sc.next();}
		while(wish.equals ("yes"));
	
	}

	}


