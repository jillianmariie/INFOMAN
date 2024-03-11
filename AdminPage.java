import java.awt.Color;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminPage {

    JFrame adminFrame;
    JTable ordersTable;
    DefaultTableModel tableModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminPage window = new AdminPage();
                    window.adminFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AdminPage() {
        initialize();
        displayOrders();
    }

    private void initialize() {
        adminFrame = new JFrame();
        adminFrame.getContentPane().setBackground(new Color(53, 64, 143));
        adminFrame.getContentPane().setLayout(null);
        adminFrame.setBounds(100, 100, 1170, 670);
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 130, 1150, 490);
        adminFrame.getContentPane().add(scrollPane);

        tableModel = new DefaultTableModel();
        ordersTable = new JTable(tableModel);
        scrollPane.setViewportView(ordersTable);

        // Add column headers
        
        tableModel.addColumn("Student_ID");
        tableModel.addColumn("Student_Name");
        tableModel.addColumn("Student_Email");
        tableModel.addColumn("Student_Phone");
        tableModel.addColumn("Student_College");
       
    }

    private void displayOrders() {
        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/preordersystem", "root", "090197");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Populate table with data
            while (rs.next()) {
                Object[] row = {
                
                        rs.getString("student_id"),
                        rs.getString("student_name"),
                        rs.getString("student_email"),
                        rs.getString("student_phone"),
                        rs.getString("student_college"),
                       
                };
                tableModel.addRow(row);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
