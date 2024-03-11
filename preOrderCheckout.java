import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class preOrderCheckout {

	JFrame checkoutFrame;
	private JTextField txtStudentName;
	private JTextField txtStudentID;
	private JTextField txtStudentEmail;
	private JTextField txtStudentPhone;
	JComboBox cBoxStudentCollege;
	
	static // Variable to hold selected items
    String selectedItems;
	
	// Database credentials
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/preordersystem";
    static final String USER = "root";
    static final String PASS = "090197";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preOrderCheckout window = new preOrderCheckout(selectedItems);
					window.checkoutFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public preOrderCheckout(String selectedItems) {
        this.selectedItems = selectedItems;
        initialize();
    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		checkoutFrame = new JFrame();
		checkoutFrame.getContentPane().setBackground(new Color(53, 64, 143));
		checkoutFrame.setBounds(100, 100, 1170, 670);
		checkoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkoutFrame.getContentPane().setLayout(null);
		
		JLabel lblCheckoutBanner = new JLabel("");
		lblCheckoutBanner.setBounds(0, 0, 1170, 120);
		ImageIcon checkoutBanner = new ImageIcon(this.getClass().getResource("Main Banner.png"));
		lblCheckoutBanner.setIcon(checkoutBanner);
		checkoutFrame.getContentPane().add(lblCheckoutBanner);
		
		JLabel lblBillingDetails = new JLabel("BILLING DETAILS");
		lblBillingDetails.setForeground(new Color(255, 255, 255));
		lblBillingDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBillingDetails.setBounds(50, 140, 200, 30);
		checkoutFrame.getContentPane().add(lblBillingDetails);
		
		// student name info
		JLabel lblStudentName = new JLabel("Name:");
		lblStudentName.setForeground(new Color(255, 255, 255));
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentName.setBounds(50, 180, 46, 15);
		checkoutFrame.getContentPane().add(lblStudentName);
		
		JLabel lblNameFormat = new JLabel("Format: (Surname, First Name, MI.)");
		lblNameFormat.setForeground(new Color(255, 255, 255));
		lblNameFormat.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNameFormat.setBounds(50, 200, 200, 14);
		checkoutFrame.getContentPane().add(lblNameFormat);
		
		txtStudentName = new JTextField();
		txtStudentName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtStudentName.setBounds(50, 220, 250, 30);
		checkoutFrame.getContentPane().add(txtStudentName);
		txtStudentName.setColumns(10);
		
		// student id info
		JLabel lblStudentID = new JLabel("Student ID:");
		lblStudentID.setForeground(new Color(255, 255, 255));
		lblStudentID.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentID.setBounds(50, 260, 100, 15);
		checkoutFrame.getContentPane().add(lblStudentID);
		
		txtStudentID = new JTextField();
		txtStudentID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtStudentID.setBounds(50, 280, 250, 30);
		checkoutFrame.getContentPane().add(txtStudentID);
		txtStudentID.setColumns(10);
		
		// student email info
		JLabel lblStudentEmail = new JLabel("Student Email:");
		lblStudentEmail.setForeground(new Color(255, 255, 255));
		lblStudentEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentEmail.setBounds(50, 320, 100, 15);
		checkoutFrame.getContentPane().add(lblStudentEmail);
		
		txtStudentEmail = new JTextField();
		txtStudentEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtStudentEmail.setBounds(50, 340, 250, 30);
		checkoutFrame.getContentPane().add(txtStudentEmail);
		txtStudentEmail.setColumns(10);
		
		// student phone info
		JLabel lblStudentPhone = new JLabel("Student Phone:");
		lblStudentPhone.setForeground(new Color(255, 255, 255));
		lblStudentPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentPhone.setBounds(50, 380, 250, 15);
		checkoutFrame.getContentPane().add(lblStudentPhone);
		
		txtStudentPhone = new JTextField();
		txtStudentPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtStudentPhone.setBounds(50, 400, 250, 30);
		checkoutFrame.getContentPane().add(txtStudentPhone);
		txtStudentPhone.setColumns(10);
		
		// student college
		JLabel lblStudentCollege = new JLabel("Student College:");
		lblStudentCollege.setForeground(new Color(255, 255, 255));
		lblStudentCollege.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentCollege.setBounds(50, 440, 250, 15);
		checkoutFrame.getContentPane().add(lblStudentCollege);
		
		cBoxStudentCollege = new JComboBox();
		cBoxStudentCollege.setModel(new DefaultComboBoxModel(new String[] {"Select a College", "CCIT", "COE", "CBA", "COA", "CAH", "CTHM", "CEAS"}));
		cBoxStudentCollege.setToolTipText("");
		cBoxStudentCollege.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cBoxStudentCollege.setBounds(50, 460, 250, 25);
		checkoutFrame.getContentPane().add(cBoxStudentCollege);
		
		// order summary panel
		JPanel panelOrderSummary = new JPanel();
		panelOrderSummary.setBackground(new Color(255, 212, 28));
		panelOrderSummary.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelOrderSummary.setBounds(370, 150, 500, 350);
		checkoutFrame.getContentPane().add(panelOrderSummary);
		panelOrderSummary.setLayout(null);
		
		JLabel lblOrderSummary = new JLabel("ORDER SUMMARY");
		lblOrderSummary.setForeground(new Color(53, 64, 143));
		lblOrderSummary.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOrderSummary.setBounds(155, 20, 190, 30);
		panelOrderSummary.add(lblOrderSummary);
		
		JLabel lblProducts = new JLabel("Products:");
		lblProducts.setForeground(new Color(0, 0, 0));
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProducts.setBounds(30, 50, 80, 15);
		panelOrderSummary.add(lblProducts);
		
		// display the selected products from previous page
		JLabel lblProductOne = new JLabel();
		lblProductOne.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblProductOne.setText(selectedItems);
		lblProductOne.setBounds(30, 70, 200, 120);
		panelOrderSummary.add(lblProductOne);
		
		// payment method
		JLabel lblPayment = new JLabel("Payment Type:");
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPayment.setBounds(30, 200, 100, 14);
		panelOrderSummary.add(lblPayment);
		
		JRadioButton rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setBackground(new Color(255, 212, 28));
		rdbtnCash.setBounds(30, 220, 100, 20);
		panelOrderSummary.add(rdbtnCash);
		
		JRadioButton rdbtnBank = new JRadioButton("Bank Transfer");
		rdbtnBank.setBackground(new Color(255, 212, 28));
		rdbtnBank.setBounds(30, 240, 110, 20);
		panelOrderSummary.add(rdbtnBank);
		
		JRadioButton rdbtnCredit = new JRadioButton("Credit/Debit");
		rdbtnCredit.setBackground(new Color(255, 212, 28));
		rdbtnCredit.setBounds(30, 260, 100, 20);
		panelOrderSummary.add(rdbtnCredit);
		
		JRadioButton rdbtnEWallet = new JRadioButton("E-Wallet");
		rdbtnEWallet.setBackground(new Color(255, 212, 28));
		rdbtnEWallet.setBounds(30, 280, 100, 20);
		panelOrderSummary.add(rdbtnEWallet);
		
		
		// placing order
        JButton btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call a method to save data to the database
                saveDataToDatabase();
                preOrderLastPage lastPage = new preOrderLastPage();
                lastPage.lastFrame.setVisible(true);
                
                
                
         
            }
        });
        btnPlaceOrder.setBounds(340, 315, 120, 25);
        panelOrderSummary.add(btnPlaceOrder);
        btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 12));
    }
	
	private void saveDataToDatabase() {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Prepare SQL query
            String selectedCollege = cBoxStudentCollege.getSelectedItem().toString();
            
            String sql = "INSERT INTO student (Student_ID, Student_Name, Student_Email, Student_Phone, Student_College) VALUES (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txtStudentID.getText());
            stmt.setString(2, txtStudentName.getText());
            stmt.setString(3, txtStudentEmail.getText());
            stmt.setString(4, txtStudentPhone.getText());
            stmt.setString(5, selectedCollege);
            

            // Execute query
            stmt.executeUpdate();

            // Close resources
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Close resources in finally block
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
	}
	
	
	
	
	
}
