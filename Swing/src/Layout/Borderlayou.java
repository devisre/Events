package Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Borderlayou {
  
	JFrame jf;  
	Borderlayou(){  
	    jf=new JFrame();  
	    
	    JButton b1=new JButton("NORTH");  
	    JButton b2=new JButton("SOUTH");  
	    JButton b3=new JButton("EAST");  
	    JButton b4=new JButton("WEST");
	    JButton b5=new JButton("CENTER");
	    
	    jf.add(b5,BorderLayout.CENTER);    
	    jf.add(b1,BorderLayout.NORTH);  
	    jf.add(b2,BorderLayout.SOUTH);  
	    jf.add(b3,BorderLayout.EAST);  
	    jf.add(b4,BorderLayout.WEST);  
	     
	    jf.setSize(300,300);  
	    jf.setVisible(true);  
	}
	public static void main(String Args[]) {
		Borderlayou BL= new Borderlayou();
	}
} 
