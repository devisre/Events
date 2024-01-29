package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends Frame implements ActionListener {

	TextField tf;
	Event1(){
		
		
		Label l1 , l2;
		 l1=new Label("First Label.");
	     l1.setBounds(50,70, 100,30);
        l2=new Label("Second Label.");
		l2.setBounds(50,150, 100,30);
        add(l1);
        add(l2);
        		
		tf =new TextField();
		tf.setBounds(30, 50 , 80 , 30);
		Button b=new Button("click ");
		b.setBounds(30, 100 , 80 , 30);
		
		b.addActionListener(this);
		add(b);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
		
	}

  public void actionPerformed(ActionEvent e ) {
	tf.setText("Welcome"+tf.getText());}	
  
	public static void main(String args[]) {
		Event1 ob=new Event1();
		

	}

}
