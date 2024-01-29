package AWT;

import java.awt.*;

public class awt1 extends Frame {
	TextField tf;
	awt1(){
     tf= new TextField();
     tf.setBounds(30, 70 , 80 , 30);
	Button b= new Button("Click me");
	b.setBounds(40,100,80,40);
	add(b);
	add (tf);
	setSize(300,300);
	setLayout(null);
	setVisible(true);}
	 
	public static void main(String args[]) {
		awt1 at=new awt1();
	
		
	}

}
