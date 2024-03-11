import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LogInPage {

	private JFrame frame;
	JTextField txtEmail;
	
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
					LogInPage window = new LogInPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(53, 64, 143));
		frame.getContentPane().setLayout(null);
		
		// yellow panel
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(new Color(255, 212, 28));
		yellowPanel.setBounds(55, 55, 520, 520);
		frame.getContentPane().add(yellowPanel);
		yellowPanel.setLayout(null);
		
		// banner and logo
		JLabel lblBanner = new JLabel("");
		lblBanner.setBounds(0, 40, 520, 195);
		ImageIcon banner = new ImageIcon(this.getClass().getResource("BANNER.png"));
		lblBanner.setIcon(banner);
		yellowPanel.add(lblBanner);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(200, 358, 120, 120);
		ImageIcon logo = new ImageIcon(this.getClass().getResource("NULogo.png"));
		lblLogo.setIcon(logo);
		yellowPanel.add(lblLogo);
		
		// white panel
		JPanel whitePanel = new JPanel();
		whitePanel.setBounds(570, 55, 520, 520);
		frame.getContentPane().add(whitePanel);
		frame.setBounds(100, 100, 1170, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		whitePanel.setLayout(null);
		
		JLabel lblCredentials = new JLabel("Bulldogs Exchange Credentials:");
		lblCredentials.setForeground(new Color(73, 88, 188));
		lblCredentials.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCredentials.setBounds(50, 120, 250, 25);
		whitePanel.add(lblCredentials);
		
		// email textfield
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(73, 88, 188));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setLabelFor(txtEmail);
		lblEmail.setBounds(50, 155, 50, 20);
		whitePanel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setForeground(new Color(53, 64, 143));
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEmail.setBounds(130, 150, 300, 30);
		whitePanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		// password field
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(73, 88, 188));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(50, 205, 80, 19);
		whitePanel.add(lblPassword);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(130, 200, 300, 30);
		whitePanel.add(password);
	
		
		// log in functionality
				JButton btnLogIn = new JButton("Login with Bulldogs Exchange");
				btnLogIn.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String enteredEmail = txtEmail.getText().trim();
				        String enteredPassword = new String(password.getPassword());

				        if (enteredEmail.equals("NUBEadmin@national-u.edu.ph") && enteredPassword.equals("Admin123")) {
				            AdminPage window = new AdminPage();
				            window.adminFrame.setVisible(true);
				        } else {
				            JOptionPane.showMessageDialog(frame, "Invalid email or password. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
				        }
				    }
				});
				btnLogIn.setForeground(Color.WHITE);
				btnLogIn.setBackground(new Color(0, 204, 0));
				btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnLogIn.setBounds(90, 300, 350, 33);
				whitePanel.add(btnLogIn);
				
				JButton btnPreOrder = new JButton("Pre-Order Uniform");
				btnPreOrder.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						preOrderSelection window = new preOrderSelection();
						window.selectionFrame.setVisible(true);
					}
				});
				btnPreOrder.setForeground(Color.WHITE);
				btnPreOrder.setBackground(new Color(0, 204, 0));
				btnPreOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPreOrder.setBounds(90, 350, 350, 33);
				whitePanel.add(btnPreOrder);
				
				JButton btnViewOrder = new JButton("View Order");
				btnViewOrder.setForeground(Color.WHITE);
				btnViewOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnViewOrder.setBackground(new Color(0, 204, 0));
				btnViewOrder.setBounds(90, 400, 350, 33);
				whitePanel.add(btnViewOrder);
				btnViewOrder.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String orderIDInput = JOptionPane.showInputDialog(frame, "Enter Order ID:", "View Order", JOptionPane.QUESTION_MESSAGE);
						
						if (orderIDInput == null || orderIDInput.isEmpty()) {
							JOptionPane.showMessageDialog(frame, "Invalid Order ID. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
				            return;
				        } else {
//				        	preOrderStudentView window = new preOrderStudentView();
//							window.studentViewFrame.setVisible(true);
				        }
				        	
						
						int orderID;
				        try {
				            orderID = Integer.parseInt(orderIDInput);
				        } catch (NumberFormatException ex) {
				            
				            return;
				        }
				        
				        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
				            String sql = "SELECT * FROM orders WHERE order_id = ?";
				            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				                stmt.setInt(1, orderID);
				                try (ResultSet rs = stmt.executeQuery()) {
				                    if (rs.next()) {
				                        // Fetch order details
				                        int Order_ID = rs.getInt("order_id");
				                        String Student_ID = rs.getString("student_id");
				                        String Product_ID = rs.getString("product_id");
				                        Date Order_Date = rs.getDate("order_date");
				                        String Order_Size = rs.getString("order_size");
				                        int Order_Quantity = rs.getInt("order_quantity");
				                        String Payment_Type = rs.getString("payment_type");
				                        int Total_Amount = rs.getInt("total_amount");
				                        String Pickup_Date = rs.getString("pickup_date");

				                        // Construct the message to display
				                        StringBuilder message = new StringBuilder();
				                        message.append("Order ID: ").append(Order_ID).append("\n")
				                               .append("Student ID: ").append(Student_ID).append("\n")
				                               .append("Product ID: ").append(Product_ID).append("\n")
				                               .append("Order Date: ").append(Order_Date).append("\n")
				                               .append("Order Size: ").append(Order_Size).append("\n")
				                               .append("Quantity: ").append(Order_Quantity).append("\n")
				                               .append("Payment Type: ").append(Payment_Type).append("\n")
				                               .append("Total Amount: ").append(Total_Amount).append("\n")
				                               .append("Pick-Up Date: ").append(Pickup_Date);

				                        // Display message dialog with "Edit" button
				                        int option = JOptionPane.showOptionDialog(frame,
				                                message.toString(),
				                                "Order Details",
				                                JOptionPane.DEFAULT_OPTION,
				                                JOptionPane.INFORMATION_MESSAGE,
				                                null,
				                                new Object[]{"Edit", "Delete", "OK"},
				                                "OK");

				                        // Handle the "Edit" button action
				                        if (option == 0) {
				                            // Perform the edit operation here
				                            // For example, open an edit dialog or frame
				                            // You can pass the Order_ID to the edit dialog/frame
				                            // EditOrderDialog editDialog = new EditOrderDialog(Order_ID);
				                            // editDialog.setVisible(true);
				                            preOrderSelection selection = new preOrderSelection();
				                            selection.selectionFrame.setVisible(true);
				                        } else if (option == 1) {
				                            // Perform the delete operation here
				                            int confirmDelete = JOptionPane.showConfirmDialog(frame, "Are you sure you want to delete this order?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
				                            if (confirmDelete == JOptionPane.YES_OPTION) {
				                                // Delete the order from the database
				                                // Write your delete operation logic here
				                                String delete = "DELETE FROM orders WHERE order_id = ?";
				                                try (PreparedStatement statement = conn.prepareStatement(delete)) {
				                                    statement.setInt(1, orderID);
				                                    int rowsAffected = statement.executeUpdate();
				                                    if (rowsAffected > 0) {
				                                        // Order successfully deleted
				                                        JOptionPane.showMessageDialog(frame, "Order deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
				                                    } else {
				                                        // Order not found or not deleted
				                                        JOptionPane.showMessageDialog(frame, "Order not found or not deleted.", "Error", JOptionPane.ERROR_MESSAGE);
				                                    }
				                                } catch (SQLException ex) {
				                                    ex.printStackTrace();
				                                    JOptionPane.showMessageDialog(frame, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
				                                }
				                            } else {
				                                JOptionPane.showMessageDialog(frame, "Order not found.", "Error", JOptionPane.ERROR_MESSAGE);
				                            }
				                        }
				                    }
				                }
				            }
				        } catch (SQLException ex) {
				            ex.printStackTrace();
				            JOptionPane.showMessageDialog(frame, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
				        }
					}
				});
	}
}


					


				
		

		       
				       
						
