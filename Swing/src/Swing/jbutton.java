package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class jbutton {

	public static void main(String[] args) {
		JFrame jf= new JFrame("button Example");
		JButton jb= new JButton("click me");
		jb.setBounds(40, 70, 100, 30);
		jf.add(jb);
		jf.setSize(300,300);
		jf.setLayout(null);
		jf.setVisible(true);
		

	}

}
