package Swing;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;

public class Showall extends JFrame {
    Showall(){
    	SwingUtilities.invokeLater(() -> {
    		MySQLDataDisplay datadisplay=new MySQLDataDisplay ();
            datadisplay.setVisible(true);
        });
    }
    
}
	