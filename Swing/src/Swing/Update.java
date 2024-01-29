package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Update  extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6;
	
	Update(){
		JFrame jf=new JFrame("Edit Students Details");
		
		 l1=new JLabel("Update Students Details");
		 l1.setBounds(120,20, 200,30);
		 l2=new JLabel("Enter id:");
		 l2.setBounds(40,70, 150,30);
		 l3=new JLabel("Enter name:");
		 l3.setBounds(40,130, 150,30);
		 l4=new JLabel("Enter class:");
		 l4.setBounds(40,160, 150,30);
		 l5=new JLabel("Enter rollno:");
		 l5.setBounds(40,190, 150,30);
		 l6=new JLabel("Enter phone number:");
		 l6.setBounds(40,220, 150,30);
		 l7=new JLabel("Enter mailid:");
		 l7.setBounds(40,250, 150,30);
		 
		 jf.add(l1);jf.add(l2);jf.add(l3);jf.add(l4);jf.add(l5);jf.add(l6);jf.add(l7);
		 
		 jt1= new JTextField();
		 jt1.setBounds(170, 70, 150, 30);
		 jt2= new JTextField("name");
		 jt2.setBounds(170, 130, 150, 30);
		 jt3= new JTextField("class");
		 jt3.setBounds(170, 160, 150, 30);
		 jt4= new JTextField("roll no");
		 jt4.setBounds(170, 190, 150, 30);
		 jt5= new JTextField("ph no");
		 jt5.setBounds(170, 220, 150, 30);
		 jt6= new JTextField("mail id");
		 jt6.setBounds(170, 250, 150, 30);
		 
		 
		 jf.add(jt1);jf.add(jt2);jf.add(jt3);jf.add(jt4);jf.add(jt5);jf.add(jt6);
		 
		 JButton Jb= new JButton("Submit");
		 Jb.setBounds(130, 100, 100, 30);
		 JButton Jb1= new JButton("OK");
		 Jb1.setBounds(130, 290, 100, 30);
		 jf.add(Jb);jf.add(Jb1);
		 
		 Jb.addActionListener(this);
		 Jb1.addActionListener(this);
		 
		 jf.setSize(500,500);
		 jf.setLayout(null);
		 jf.setVisible(true); 
		 
	}
	
	void showmethod()throws SQLException {
	     Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/colleagedb","root","sreepriya1357");
	     
	     int id=Integer.parseInt(jt1.getText());
	        System.out.println(id);
	        
	        
	        PreparedStatement st=obj.prepareStatement("select * from Students where id=? ");
	        st.setInt(1,id);
	        ResultSet rs=st.executeQuery();
		    while(rs.next()) {
			System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3)+","+rs.getInt(4)+","+rs.getInt(5)+","+rs.getString(6));
		    String id1=Integer.toString(rs.getInt(1));
		    String id3=Integer.toString(rs.getInt(3));
		    String id4=Integer.toString(rs.getInt(4));
		    String id5=Integer.toString(rs.getInt(5));
		    jt1.setText (id1);
		    jt2.setText(rs.getString(2));
		    jt3.setText(id3);
		    jt4.setText(id4);
		    jt5.setText(id5);
		    jt6.setText(rs.getString(6));}
	}
	
	void updatemethod()throws SQLException {
		 System.out.println("inupdate");
		
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/colleagedb","root","sreepriya1357");
		
		 int id=Integer.parseInt(jt1.getText());
		 System.out.println(id);
		 String nam=jt2.getText();
		 System.out.println(nam);
		 int clas=Integer.parseInt(jt3.getText());
		 System.out.println(clas);
		 int rol=Integer.parseInt(jt4.getText());
		 System.out.println(rol);
		 int ph=Integer.parseInt(jt5.getText());
	     System.out.println(ph);
		 String email=jt6.getText();
		 System.out.println(email);
		 
		 System.out.println("aftr get");
//		PreparedStatement st1=obj.prepareStatement("update Students set id=? where name=?");
//		st1.setInt(1,id);
//   		st1.setString(2,nam);
   		
   		PreparedStatement st2=obj.prepareStatement("update Students set name=? where id=?");
		st2.setString(1,nam);
		st2.setInt(2,id);
		
		PreparedStatement st3=obj.prepareStatement("update Students set class=? where id=?");
		st3.setInt(1,clas);
		st3.setInt(2,id);
		
		PreparedStatement st4=obj.prepareStatement("update Students set rollno=? where id=?");
		st4.setInt(1,rol);
		st4.setInt(2,id);
		
		PreparedStatement st5=obj.prepareStatement("update Students set phno=? where id=?");
	    st5.setInt(1,ph);
	    st5.setInt(2,id);
	    
		PreparedStatement st6=obj.prepareStatement("update Students set mailid=? where id=?");
	    st6.setString(1,email);
	    st6.setInt(2,id);
	    
    //    st1.executeUpdate();
        st2.executeUpdate();
        st3.executeUpdate();
        st4.executeUpdate();
        st5.executeUpdate();
        st6.executeUpdate();
        System.out.println("sucess");
       
	}
	
	public void actionPerformed(ActionEvent e )  {
		
		if(e.getActionCommand().equals("Submit")) {
			 try {
				showmethod();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}}
		if(e.getActionCommand().equals("OK")) {    
			 try {
				 System.out.println("ok");
				 updatemethod();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
						 
			 
			 
		}
		
		
		
  }
	 
	}
