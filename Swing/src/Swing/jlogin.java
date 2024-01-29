package Swing;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class jlogin extends JFrame implements ActionListener {
	JTextField Jt,Jt1;
	JPasswordField jp;
	JLabel l1,l2,l3;
	jlogin(){
		JFrame jf= new JFrame("button Example");
		
		 
		JLabel l1 , l2 ;
		 l1=new JLabel("Login form");
	     l1.setBounds(120,20, 100,30);
         l2=new JLabel("Username");
		 l2.setBounds(50,70, 100,30);
		 l3=new JLabel("Password:");
		 l3.setBounds(50,100,80,30);
		 
		 Jt= new JTextField();
		 Jt.setBounds(150, 70, 100, 30);
		 Jt1= new JPasswordField();
		 Jt1.setBounds(150, 100, 100, 30);
		 
		 JButton Jb= new JButton("Login");
		 Jb.setBounds(80, 150, 100, 30);
		 
		 Jb.addActionListener(this) ;
		 jf.add(l1);jf.add(l2);jf.add(l3);
		 jf.add(Jt);jf.add(Jt1);
		 jf.add(Jb);
		 jf.setSize(400,400);
		 jf.setLayout(null);
		 jf.setVisible(true);  }
	
	public void actionPerformed(ActionEvent e ) {
		String username= "abc";
		String password="123";
		String name=Jt.getText();
		String nam=Jt1.getText();
		
		if((name.equals(username))&&(nam.equals(password))){
			System.out.println("Login successfully");
			}
		else  {
			System.out.println("Error!");  
		}
	}

	public static void main(String[] args) {
		jlogin jl= new jlogin();
	}

}
