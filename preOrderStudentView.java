import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class preOrderStudentView {

	JFrame studentViewFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preOrderStudentView window = new preOrderStudentView();
					window.studentViewFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public preOrderStudentView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		studentViewFrame = new JFrame();
		studentViewFrame.getContentPane().setBackground(new Color(53, 64, 143));
		studentViewFrame.setBounds(100, 100, 1170, 670);
		studentViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentViewFrame.getContentPane().setLayout(null);
		
		JLabel lblStudentViewBanner = new JLabel("");
		lblStudentViewBanner.setBounds(0, 0, 1170, 120);
		ImageIcon studentViewBanner = new ImageIcon(this.getClass().getResource("Main Banner.png"));
		lblStudentViewBanner.setIcon(studentViewBanner);
		studentViewFrame.getContentPane().add(lblStudentViewBanner);
		
		JButton btnEdit = new JButton("Edit Order");
//		btnEdit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String selectedItems = getSelectedItems();
//	            preOrderCart cart = new preOrderCart(selectedItems);
//	            cart.cartFrame.setVisible(true);
//				
//			}
//		});
		btnEdit.setBackground(new Color(255, 255, 255));
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEdit.setBounds(50, 150, 100, 30);
		studentViewFrame.getContentPane().add(btnEdit);
		
		JButton btnCancel = new JButton("Cancel Order");
		btnCancel.setBackground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(200, 150, 120, 30);
		studentViewFrame.getContentPane().add(btnCancel);
	}
}
