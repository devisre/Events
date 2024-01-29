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

public class Show extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,L1,L2,L3,L4,L5,L6;
	JTextField jt1;
	Show(){
		
		 l1=new JLabel("Show students details");
		 l1.setBounds(120,20, 200,30);
		 l2=new JLabel("Enter id:");
		 l2.setBounds(50,70, 150,30);
		 l3=new JLabel("Id :");
		 l3.setBounds(50,100, 200,30);
		 l4=new JLabel("Name :");
		 l4.setBounds(50,130, 200,30);
		 l5=new JLabel("Class :");
		 l5.setBounds(50,160, 200,30);
		 l6=new JLabel("Roll no :");
		 l6.setBounds(50,190, 200,30);
		 l7=new JLabel("Phone no :");
		 l7.setBounds(50,220, 200,30);
		 l8=new JLabel("Mail id :");
		 l8.setBounds(50,250, 200,30);
		 add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);
		 
		 L1=new JLabel();
		 L1.setBounds(120,100, 200,30);
		 L2=new JLabel();
		 L2.setBounds(120,130, 200,30);
		 L3=new JLabel();
		 L3.setBounds(120,160, 200,30);
		 L4=new JLabel();
		 L4.setBounds(120,190, 200,30);
		 L5=new JLabel();
		 L5.setBounds(120,220, 200,30);
		 L6=new JLabel();
		 L6.setBounds(120,250, 200,30);
		 add(L1);add(L2);add(L3);add(L4);add(L5);add(L6);
		 
		 jt1= new JTextField();
		 jt1.setBounds(100, 70, 70, 30);
		 add(jt1);
		 
		 JButton Jb= new JButton("Submit");
		 Jb.setBounds(200, 70, 100, 30);
		 add(Jb);
		 
		 Jb.addActionListener(this);
		 setSize(500,500);
		 setLayout(null);
		 setVisible(true);  }
	
	void showmethod() throws SQLException {
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
	    L1.setText (id1);
	    L2.setText(rs.getString(2));
	    L3.setText(id3);
	    L4.setText(id4);
	    L5.setText(id5);
	    L6.setText(rs.getString(6));}
	    
	
	}
		 
	public void actionPerformed(ActionEvent e ) {

		  if(e.getActionCommand().equals("Submit")) {
			  try {
				showmethod();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}  
		  }
		 
		
	  }
	}
