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

public class Delete extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;
	JTextField jt4;
	JTextField jt5;
	JTextField jt6;
	Delete(){
		JFrame jf=new JFrame("Delete Students Details");
		
		 l1=new JLabel("Delete Students Details");
		 l1.setBounds(120,20, 200,30);
		 l2=new JLabel("Enter id:");
		 l2.setBounds(70,70, 150,30);
         jf.add(l1);jf.add(l2);
		 
		 jt1= new JTextField();
		 jt1.setBounds(170, 70, 150, 30);
		 jf.add(jt1);
		 
		 JButton Jb= new JButton("Submit");
		 Jb.setBounds(130, 150, 100, 30);
		 jf.add(Jb);
		 
		 Jb.addActionListener(this);
		 jf.setSize(400,400);
		 jf.setLayout(null);
		 jf.setVisible(true); 
		 
	}
	
	void deletemethod ()  throws SQLException  {
    	
        Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/colleagedb","root","sreepriya1357");
        PreparedStatement st=obj.prepareStatement("delete from Students where id=?");
        
        int id=Integer.parseInt(jt1.getText());
		jt1.setText(String.valueOf(id));
		
        st.setInt(1,id);
		st.executeUpdate(); 
		
	}
	
    public void actionPerformed(ActionEvent e ) {
    	
    	try {
			deletemethod();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        }

  }


