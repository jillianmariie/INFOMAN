import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class preOrderCart {

    JFrame cartFrame;
    JLabel lblSelectedItems;
    private JButton btnOrderMore;
    private JButton btnCheckout;

    public preOrderCart(String selectedItems) {
        initialize(selectedItems);
    }

    private void initialize(String selectedItems) {
        cartFrame = new JFrame();
        cartFrame.getContentPane().setBackground(new Color(53, 64, 143));
        cartFrame.setBounds(100, 100, 1170, 670);
        cartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cartFrame.getContentPane().setLayout(null);

        JLabel lblCartBanner = new JLabel("");
        lblCartBanner.setBounds(0, 0, 1170, 120);
        lblCartBanner.setIcon(new ImageIcon(preOrderCart.class.getResource("Main Banner.png")));
        cartFrame.getContentPane().add(lblCartBanner);

        lblSelectedItems = new JLabel(selectedItems);
        lblSelectedItems.setVerticalAlignment(SwingConstants.TOP);
        lblSelectedItems.setForeground(Color.WHITE);
        lblSelectedItems.setBounds(50, 150, 1000, 200);
        cartFrame.getContentPane().add(lblSelectedItems);
        
        btnOrderMore = new JButton("Order More");
        btnOrderMore.setForeground(new Color(53, 64, 143));
        btnOrderMore.setBackground(new Color(255, 255, 255));
        btnOrderMore.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnOrderMore.setBounds(850, 130, 120, 25);
        cartFrame.getContentPane().add(btnOrderMore);
        
        btnCheckout = new JButton("Checkout");
        btnCheckout.setForeground(new Color(53, 64, 143));
        btnCheckout.setBackground(new Color(255, 255, 255));
        btnCheckout.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCheckout.setBounds(1000, 130, 120, 25);
        cartFrame.getContentPane().add(btnCheckout);
        
        // ActionListener for btnCheckout
        btnCheckout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the checkout page and pass selectedItems
                preOrderCheckout checkout = new preOrderCheckout(selectedItems);
                // Show the checkout page
                checkout.checkoutFrame.setVisible(true); 
                // Hide the cart frame (optional)
                cartFrame.setVisible(false);
            }
        });
    }
}
