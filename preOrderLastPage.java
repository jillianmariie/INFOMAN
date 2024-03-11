import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class preOrderLastPage {

	JFrame lastFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preOrderLastPage window = new preOrderLastPage();
					window.lastFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public preOrderLastPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lastFrame = new JFrame();
		lastFrame.getContentPane().setBackground(new Color(53, 64, 143));
		lastFrame.setBounds(100, 100, 1170, 670);
		lastFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lastFrame.getContentPane().setLayout(null);
		
		JLabel lblViewOrderBanner = new JLabel("");
		lblViewOrderBanner.setBounds(0, 0, 1170, 120);
		ImageIcon viewOrderBanner = new ImageIcon(this.getClass().getResource("Main Banner.png"));
		lblViewOrderBanner.setIcon(viewOrderBanner);
		lastFrame.getContentPane().add(lblViewOrderBanner);
		
		JLabel lblSubmitted = new JLabel("Your order has been submitted!");
		lblSubmitted.setForeground(new Color(255, 212, 28));
		lblSubmitted.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSubmitted.setBounds(345, 300, 500, 100);
		lastFrame.getContentPane().add(lblSubmitted);
	}
}
