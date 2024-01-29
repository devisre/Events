package Swing;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;

public class MySQLDataDisplay extends JFrame {
    private JTable dataTable;
    private JScrollPane scrollPane;
    private Connection connection;

    public MySQLDataDisplay() {
        setTitle("MySQL Data Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        dataTable = new JTable();
        scrollPane = new JScrollPane(dataTable);
        add(scrollPane, BorderLayout.CENTER);

        connectToDB();
        fetchDataFromTable();
    }
    
    private void connectToDB() {
       try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/colleagedb","root","sreepriya1357");        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void fetchDataFromTable() {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Students";
            ResultSet resultSet = statement.executeQuery(query);

            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

           
            DefaultTableModel model= new DefaultTableModel();
            
        
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                model.addColumn(metaData.getColumnName(columnIndex));
            }

     while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

         dataTable.setModel(model);

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MySQLDataDisplay dataDisplay = new MySQLDataDisplay();
            dataDisplay.setVisible(true);
        });
    }
}