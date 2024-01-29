package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Insert extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	
  Insert (){
		l1=new JLabel("Insert Students Details");
		l1.setBounds(70, 20, 150, 30);
		l2=new JLabel("Enter Id:");
		l2.setBounds(30, 70, 150, 30);
		l3=new JLabel("Enter Name:");
		l3.setBounds(30, 100, 150, 30);
		l4=new JLabel("Enter class:");
		l4.setBounds(30, 130, 150, 30);
		l5=new JLabel("Enter Roll No:");
		l5.setBounds(30, 160, 150, 30);
		l6=new JLabel("Enter Phone No:");
		l6.setBounds(30, 190, 150, 30);
		l7=new JLabel("Enter Mail Id:");
		l7.setBounds(30, 220, 150, 30);
		
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
		
		tf1 = new JTextField();
		tf1.setBounds(150,70,150,30);
		tf2 = new JTextField();
		tf2.setBounds(150,100,150,30);
		tf3 = new JTextField();
		tf3.setBounds(150,130,150,30);
		tf4 = new JTextField();
		tf4.setBounds(150,160,150,30);
		tf5 = new JTextField();
		tf5.setBounds(150,190,150,30);
		tf6 = new JTextField();
		tf6.setBounds(150,220,150,30);
		
		add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(tf6);
		
		JButton b= new JButton("Submit") ;
		b.setBounds(70,260,80, 30);
		add(b);
		
		b.addActionListener(this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	
 void insertmethod()throws SQLException  {
    	
        Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/colleagedb","root","sreepriya1357");
        
        int id=Integer.parseInt(tf1.getText());
		System.out.println(id);
		String nam=tf2.getText();
		System.out.println(nam);
		int clas=Integer.parseInt(tf3.getText());
		System.out.println(clas);
		int rol=Integer.parseInt(tf4.getText());
		System.out.println(rol);
		int ph=Integer.parseInt(tf5.getText());
		System.out.println(ph);
		String email=tf6.getText();
		System.out.println(email);
		
		PreparedStatement st=obj.prepareStatement("insert into Students values(?,?,?,?,?,?)");
		st.setInt(1,id);
		st.setString(2,nam);
		st.setInt(3,clas);
		st.setInt(4,rol);
		st.setInt(5,ph);
		st.setString(6,email);
		
		st.executeUpdate();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		try {
			insertmethod();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}

}
