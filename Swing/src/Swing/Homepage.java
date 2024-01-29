package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Homepage extends JFrame implements ActionListener{
	
    JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3;
	Homepage() {
	   JFrame jf= new JFrame("Students Details");
	   
	   l1=new JLabel("Homepage");
	   l1.setBounds(150,20, 100,30);
	   jf.add(l1);
	   
	   b1= new JButton("Show all details");
	   b1.setBounds(80, 70, 200, 30);
	   b2= new JButton("Insert Students Details");
	   b2.setBounds(80, 100, 200, 30);
	   b3= new JButton("Delete Students Details");
	   b3.setBounds(80, 130, 200, 30);
	   b4= new JButton("Update Students Details");
	   b4.setBounds(80, 160, 200, 30);
	   b5= new JButton("Show Students Details");
	   b5.setBounds(80, 190, 200, 30);
	   
	   jf.add(b1);
	   jf.add(b2);
	   jf.add(b3);
	   jf.add(b4);
	   jf.add(b5);
       
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	   b5.addActionListener(this);
	  
	   jf.setSize(400,400);
	   jf.setLayout(null);
	   jf.setVisible(true);   
	   
	    }
	
	public void actionPerformed(ActionEvent e ) {
		
		if(e.getActionCommand().equals("Show all details")) {
			  new Showall();
		}
		else if(e.getActionCommand().equals("Insert Students Details")) {
			  new Insert();
		}
		else if(e.getActionCommand().equals("Delete Students Details")) {
			  new Delete();
		}
		else if(e.getActionCommand().equals("Update Students Details")) {
			  new Update();
		}
		else if(e.getActionCommand().equals("Show Students Details")) {
			  new Show();
		}
	}
	   
     
	public static void main(String[] args) {
		Homepage hp=new Homepage();
		
	}

}
