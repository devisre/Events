package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actionlistener1 extends Frame implements ActionListener{
	TextField tf;
	TextField tf1;
	TextField tf2;
	Actionlistener1(){
		tf = new TextField();
		tf.setBounds(30,40,80,30);
		
		tf1 = new TextField();
		tf1.setBounds(30,70,80,30);
		
		Button b= new Button("add") ;
		b.setBounds(30,100,80, 30);
		Button b1= new Button("sub") ;
		b1.setBounds(30,130,80, 30);

		tf2 = new TextField();
		tf2.setBounds(30,160,80,30);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		add(tf);
		add(tf1);
		add(b);
		add(b1);
		add(tf2);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		}
	
	public void actionPerformed(ActionEvent e ) {
		int a=Integer.parseInt(tf.getText());
		int b=Integer.parseInt(tf1.getText());
		
		//int d=a-b;
		if(e.getActionCommand().equals("add")) {
			int c=a+b;
			tf2.setText(String.valueOf(c));
		}	
		else if(e.getActionCommand().equals("sub")) {
			int c=a-b;
			tf2.setText(String.valueOf(c));
		}	
		}
		
		
	public static void main(String[] args) {
		Actionlistener1 al=new Actionlistener1();

	}

}
