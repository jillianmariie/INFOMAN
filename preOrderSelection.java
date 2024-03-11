import java.awt.Color;
import java.awt.EventQueue;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.DefaultComboBoxModel;


public class preOrderSelection {

    JFrame selectionFrame;
    private JComboBox<String> cBoxSize001;
    private JComboBox<String> cBoxQuantity001;
    private JComboBox<String> cBoxSize002;
    private JComboBox<String> cBoxQuantity002;
    private JCheckBox cboxUnif001;
    private JCheckBox cboxUnif002;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    preOrderSelection window = new preOrderSelection();
                    window.selectionFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public preOrderSelection() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        selectionFrame = new JFrame();
        selectionFrame.getContentPane().setBackground(new Color(53, 64, 143));
        selectionFrame.setBounds(100, 100, 1260, 750);
        selectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectionFrame.getContentPane().setLayout(null);

        JPanel selectionPanel = new JPanel();
        selectionPanel.setBackground(Color.WHITE);
        selectionPanel.setBounds(12, 123, 1221, 590);
        selectionFrame.getContentPane().add(selectionPanel);
        selectionPanel.setLayout(null);

        JLabel lblTitleTrad = new JLabel("TRADITIONAL UNIFORM");
        lblTitleTrad.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitleTrad.setBounds(22, 10, 357, 28);
        selectionPanel.add(lblTitleTrad);
        
        // trad blouse
        cboxUnif001 = new JCheckBox("");
        cboxUnif001.setBackground(new Color(255, 255, 255));
        cboxUnif001.setBounds(29, 39, 20, 20);
        selectionPanel.add(cboxUnif001);
        
        JLabel lblUnif001 = new JLabel("Traditional Uniform Blouse");
        lblUnif001.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif001.setBounds(59, 41, 170, 15);
        selectionPanel.add(lblUnif001);
        
        JLabel lblProduct001 = new JLabel("NUBEUNIF0001");
        lblProduct001.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct001.setBounds(59, 57, 70, 15);
        selectionPanel.add(lblProduct001);
        
        JLabel lblPrice001 = new JLabel("₱560");
        lblPrice001.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice001.setBounds(239, 41, 40, 15);
        selectionPanel.add(lblPrice001);

        cBoxSize001 = new JComboBox<>();
        cBoxSize001.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize001.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize001.setBounds(289, 41, 40, 20);
        selectionPanel.add(cBoxSize001);

        cBoxQuantity001 = new JComboBox<>();
        cBoxQuantity001.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity001.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity001.setBounds(339, 41, 40, 20);
        selectionPanel.add(cBoxQuantity001);
        
        
        // trad polo
        cboxUnif002 = new JCheckBox("");
        cboxUnif002.setBackground(new Color(255, 255, 255));
        cboxUnif002.setBounds(29, 79, 20, 20);
        selectionPanel.add(cboxUnif002);
        
        JLabel lblUnif002 = new JLabel("Traditional Uniform Polo");
        lblUnif002.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif002.setBounds(59, 81, 170, 15);
        selectionPanel.add(lblUnif002);
        
        JLabel lblProduct002 = new JLabel("NUBEUNIF0002");
        lblProduct002.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct002.setBounds(59, 97, 70, 15);
        selectionPanel.add(lblProduct002);
        
        JLabel lblPrice002 = new JLabel("₱560");
        lblPrice002.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice002.setBounds(239, 81, 40, 15);
        selectionPanel.add(lblPrice002);

        cBoxSize002 = new JComboBox<>();
        cBoxSize002.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize002.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize002.setBounds(289, 81, 40, 20);
        selectionPanel.add(cBoxSize002);

        cBoxQuantity002 = new JComboBox<>();
        cBoxQuantity002.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity002.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity002.setBounds(339, 81, 40, 20);
        selectionPanel.add(cBoxQuantity002);
        
        JCheckBox cboxUnif003 = new JCheckBox("");
        cboxUnif003.setBackground(Color.WHITE);
        cboxUnif003.setBounds(29, 118, 20, 20);
        selectionPanel.add(cboxUnif003);
        
        JLabel lblUnif003 = new JLabel("Traditional Pants - Female ");
        lblUnif003.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif003.setBounds(59, 120, 170, 15);
        selectionPanel.add(lblUnif003);
        
        JLabel lblProduct003 = new JLabel("NUBEUNIF0003");
        lblProduct003.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct003.setBounds(59, 138, 70, 15);
        selectionPanel.add(lblProduct003);
        
        JLabel lblPrice003 = new JLabel("₱470");
        lblPrice003.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice003.setBounds(239, 120, 40, 15);
        selectionPanel.add(lblPrice003);
        
        JComboBox<String> cBoxSize003 = new JComboBox<String>();
        cBoxSize003.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize003.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize003.setBounds(289, 120, 40, 20);
        selectionPanel.add(cBoxSize003);
        
        JComboBox<String> cBoxQuantity003 = new JComboBox<String>();
        cBoxQuantity003.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity003.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity003.setBounds(339, 120, 40, 20);
        selectionPanel.add(cBoxQuantity003);
        
        JCheckBox cboxUnif004 = new JCheckBox("");
        cboxUnif004.setBackground(Color.WHITE);
        cboxUnif004.setBounds(29, 163, 20, 20);
        selectionPanel.add(cboxUnif004);
        
        JLabel lblUnif004 = new JLabel("Traditional Pants - Male ");
        lblUnif004.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif004.setBounds(59, 165, 170, 15);
        selectionPanel.add(lblUnif004);
        
        JLabel lblProduct004 = new JLabel("NUBEUNIF0004");
        lblProduct004.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct004.setBounds(59, 181, 70, 15);
        selectionPanel.add(lblProduct004);
        
        JLabel lblPrice004 = new JLabel("₱470");
        lblPrice004.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice004.setBounds(239, 165, 40, 15);
        selectionPanel.add(lblPrice004);
        
        JComboBox<String> cBoxSize004 = new JComboBox<String>();
        cBoxSize004.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize004.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize004.setBounds(289, 165, 40, 20);
        selectionPanel.add(cBoxSize004);
        
        JComboBox<String> cBoxQuantity004 = new JComboBox<String>();
        cBoxQuantity004.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity004.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity004.setBounds(339, 165, 40, 20);
        selectionPanel.add(cBoxQuantity004);
        
        JCheckBox cboxUnif005 = new JCheckBox("");
        cboxUnif005.setBackground(Color.WHITE);
        cboxUnif005.setBounds(29, 206, 20, 20);
        selectionPanel.add(cboxUnif005);
        
        JLabel lblUnif005 = new JLabel("Traditional Skirt");
        lblUnif005.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif005.setBounds(59, 208, 170, 15);
        selectionPanel.add(lblUnif005);
        
        JLabel lblProduct005 = new JLabel("NUBEUNIF0005");
        lblProduct005.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct005.setBounds(59, 224, 70, 15);
        selectionPanel.add(lblProduct005);
        
        JLabel lblPrice005 = new JLabel("₱310");
        lblPrice005.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice005.setBounds(239, 208, 40, 15);
        selectionPanel.add(lblPrice005);
        
        JComboBox<String> cBoxSize005 = new JComboBox<String>();
        cBoxSize005.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize005.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize005.setBounds(289, 208, 40, 20);
        selectionPanel.add(cBoxSize005);
        
        JComboBox<String> cBoxQuantity005 = new JComboBox<String>();
        cBoxQuantity005.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity005.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity005.setBounds(339, 208, 40, 20);
        selectionPanel.add(cBoxQuantity005);
        
        JLabel lblTitleCAH = new JLabel("COLLEGE OF ALLIED HEALTH UNIFORM");
        lblTitleCAH.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitleCAH.setBounds(22, 243, 357, 28);
        selectionPanel.add(lblTitleCAH);
        
        JCheckBox cboxUnif006 = new JCheckBox("");
        cboxUnif006.setBackground(Color.WHITE);
        cboxUnif006.setBounds(29, 272, 20, 20);
        selectionPanel.add(cboxUnif006);
        
        JLabel lblUnif006 = new JLabel("CAH White Skirt");
        lblUnif006.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif006.setBounds(59, 274, 170, 15);
        selectionPanel.add(lblUnif006);
        
        JLabel lblProduct006 = new JLabel("NUBEUNIF0006");
        lblProduct006.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct006.setBounds(59, 290, 70, 15);
        selectionPanel.add(lblProduct006);
        
        JLabel lblPrice006 = new JLabel("₱450");
        lblPrice006.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice006.setBounds(239, 274, 40, 15);
        selectionPanel.add(lblPrice006);
        
        JComboBox<String> cBoxSize006 = new JComboBox<String>();
        cBoxSize006.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize006.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize006.setBounds(289, 274, 40, 20);
        selectionPanel.add(cBoxSize006);
        
        JComboBox<String> cBoxQuantity006 = new JComboBox<String>();
        cBoxQuantity006.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity006.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity006.setBounds(339, 274, 40, 20);
        selectionPanel.add(cBoxQuantity006);
        
        JCheckBox cboxUnif007 = new JCheckBox("");
        cboxUnif007.setBackground(Color.WHITE);
        cboxUnif007.setBounds(29, 312, 20, 20);
        selectionPanel.add(cboxUnif007);
        
        JLabel lblUnif007 = new JLabel("CAH White Pants");
        lblUnif007.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif007.setBounds(59, 314, 170, 15);
        selectionPanel.add(lblUnif007);
        
        JLabel lblProduct007 = new JLabel("NUBEUNIF0007");
        lblProduct007.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct007.setBounds(59, 330, 70, 15);
        selectionPanel.add(lblProduct007);
        
        JLabel lblPrice007 = new JLabel("₱550");
        lblPrice007.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice007.setBounds(239, 314, 40, 15);
        selectionPanel.add(lblPrice007);
        
        JComboBox<String> cBoxSize007 = new JComboBox<String>();
        cBoxSize007.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize007.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize007.setBounds(289, 314, 40, 20);
        selectionPanel.add(cBoxSize007);
        
        JComboBox<String> cBoxQuantity007 = new JComboBox<String>();
        cBoxQuantity007.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity007.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity007.setBounds(339, 314, 40, 20);
        selectionPanel.add(cBoxQuantity007);
        
        JLabel lblTitlePsych = new JLabel("PSYCHOLOGY UNIFORM");
        lblTitlePsych.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitlePsych.setBounds(22, 350, 357, 28);
        selectionPanel.add(lblTitlePsych);
        
        JCheckBox cboxUnif008 = new JCheckBox("");
        cboxUnif008.setBackground(Color.WHITE);
        cboxUnif008.setBounds(29, 384, 20, 20);
        selectionPanel.add(cboxUnif008);
        
        JLabel lblUnif008 = new JLabel("Psychology Blouse with Mustard Pocket Piping ");
        lblUnif008.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif008.setBounds(59, 386, 170, 15);
        selectionPanel.add(lblUnif008);
        
        JLabel lblProduct008 = new JLabel("NUBEUNIF0008");
        lblProduct008.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct008.setBounds(59, 402, 70, 15);
        selectionPanel.add(lblProduct008);
        
        JLabel lblPrice008 = new JLabel("₱600");
        lblPrice008.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice008.setBounds(239, 386, 40, 15);
        selectionPanel.add(lblPrice008);
        
        JComboBox<String> cBoxSize008 = new JComboBox<String>();
        cBoxSize008.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize008.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize008.setBounds(289, 386, 40, 20);
        selectionPanel.add(cBoxSize008);
        
        JComboBox<String> cBoxQuantity008 = new JComboBox<String>();
        cBoxQuantity008.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity008.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity008.setBounds(339, 386, 40, 20);
        selectionPanel.add(cBoxQuantity008);
        
        JCheckBox cboxUnif009 = new JCheckBox("");
        cboxUnif009.setBackground(Color.WHITE);
        cboxUnif009.setBounds(29, 424, 20, 20);
        selectionPanel.add(cboxUnif009);
        
        JLabel lblUnif009 = new JLabel("Psychology Polo with Gold Pocket Piping");
        lblUnif009.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif009.setBounds(59, 426, 170, 15);
        selectionPanel.add(lblUnif009);
        
        JLabel lblProduct009 = new JLabel("NUBEUNIF0009");
        lblProduct009.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct009.setBounds(59, 442, 70, 15);
        selectionPanel.add(lblProduct009);
        
        JLabel lblPrice009 = new JLabel("₱600");
        lblPrice009.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice009.setBounds(239, 426, 40, 15);
        selectionPanel.add(lblPrice009);
        
        JComboBox<String> cBoxSize009 = new JComboBox<String>();
        cBoxSize009.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize009.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize009.setBounds(289, 426, 40, 20);
        selectionPanel.add(cBoxSize009);
        
        JComboBox<String> cBoxQuantity009 = new JComboBox<String>();
        cBoxQuantity009.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity009.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity009.setBounds(339, 426, 40, 20);
        selectionPanel.add(cBoxQuantity009);
        
        JLabel lblTitleMedTech = new JLabel("MEDICAL TECHNOLOGY UNIFORM");
        lblTitleMedTech.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitleMedTech.setBounds(22, 464, 357, 28);
        selectionPanel.add(lblTitleMedTech);
        
        JCheckBox cboxUnif010 = new JCheckBox("");
        cboxUnif010.setBackground(Color.WHITE);
        cboxUnif010.setBounds(29, 498, 20, 20);
        selectionPanel.add(cboxUnif010);
        
        JLabel lblUnif010 = new JLabel("MedTech Blouse with Green Pocket Piping");
        lblUnif010.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif010.setBounds(59, 500, 170, 15);
        selectionPanel.add(lblUnif010);
        
        JLabel lblProduct010 = new JLabel("NUBEUNIF0010");
        lblProduct010.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct010.setBounds(59, 516, 70, 15);
        selectionPanel.add(lblProduct010);
        
        JLabel lblPrice010 = new JLabel("₱600");
        lblPrice010.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice010.setBounds(239, 500, 40, 15);
        selectionPanel.add(lblPrice010);
        
        JComboBox<String> cBoxSize010 = new JComboBox<String>();
        cBoxSize010.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize010.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize010.setBounds(289, 500, 40, 20);
        selectionPanel.add(cBoxSize010);
        
        JComboBox<String> cBoxQuantity010 = new JComboBox<String>();
        cBoxQuantity010.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity010.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity010.setBounds(339, 500, 40, 20);
        selectionPanel.add(cBoxQuantity010);
        
        JCheckBox cboxUnif011 = new JCheckBox("");
        cboxUnif011.setBackground(Color.WHITE);
        cboxUnif011.setBounds(29, 538, 20, 20);
        selectionPanel.add(cboxUnif011);
        
        JLabel lblUnif011 = new JLabel("MedTech Polo with Green Pocket Piping");
        lblUnif011.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif011.setBounds(59, 540, 170, 15);
        selectionPanel.add(lblUnif011);
        
        JLabel lblProduct011 = new JLabel("NUBEUNIF0011");
        lblProduct011.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct011.setBounds(59, 556, 85, 15);
        selectionPanel.add(lblProduct011);
        
        JLabel lblPrice011 = new JLabel("₱600");
        lblPrice011.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice011.setBounds(239, 540, 40, 15);
        selectionPanel.add(lblPrice011);
        
        JComboBox<String> cBoxSize011 = new JComboBox<String>();
        cBoxSize011.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize011.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize011.setBounds(289, 540, 40, 20);
        selectionPanel.add(cBoxSize011);
        
        JComboBox<String> cBoxQuantity011 = new JComboBox<String>();
        cBoxQuantity011.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity011.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity011.setBounds(339, 540, 40, 20);
        selectionPanel.add(cBoxQuantity011);
        
        JLabel lblTitleNursing = new JLabel("NURSING UNIFORM");
        lblTitleNursing.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitleNursing.setBounds(435, 10, 357, 28);
        selectionPanel.add(lblTitleNursing);
        
        JCheckBox cboxUnif012 = new JCheckBox("");
        cboxUnif012.setBackground(Color.WHITE);
        cboxUnif012.setBounds(442, 39, 20, 20);
        selectionPanel.add(cboxUnif012);
        
        JLabel lblUnif012 = new JLabel("Nursing Blouse with Gold Pocket Piping");
        lblUnif012.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif012.setBounds(472, 41, 170, 15);
        selectionPanel.add(lblUnif012);
        
        JLabel lblProduct012 = new JLabel("NUBEUNIF0012");
        lblProduct012.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct012.setBounds(472, 57, 70, 15);
        selectionPanel.add(lblProduct012);
        
        JLabel lblPrice012 = new JLabel("₱600");
        lblPrice012.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice012.setBounds(652, 41, 40, 15);
        selectionPanel.add(lblPrice012);
        
        JComboBox<String> cBoxSize012 = new JComboBox<String>();
        cBoxSize012.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize012.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize012.setBounds(702, 41, 40, 20);
        selectionPanel.add(cBoxSize012);
        
        JComboBox<String> cBoxQuantity012 = new JComboBox<String>();
        cBoxQuantity012.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity012.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity012.setBounds(752, 41, 40, 20);
        selectionPanel.add(cBoxQuantity012);
        
        JCheckBox cboxUnif013 = new JCheckBox("");
        cboxUnif013.setBackground(Color.WHITE);
        cboxUnif013.setBounds(442, 79, 20, 20);
        selectionPanel.add(cboxUnif013);
        
        JLabel lblUnif013 = new JLabel("Nursing Polo with Gold Pocket Piping");
        lblUnif013.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif013.setBounds(472, 81, 170, 15);
        selectionPanel.add(lblUnif013);
        
        JLabel lblProduct013 = new JLabel("NUBEUNIF0013");
        lblProduct013.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct013.setBounds(472, 97, 85, 15);
        selectionPanel.add(lblProduct013);
        
        JLabel lblPrice013 = new JLabel("₱600");
        lblPrice013.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice013.setBounds(652, 81, 40, 15);
        selectionPanel.add(lblPrice013);
        
        JComboBox<String> cBoxSize013 = new JComboBox<String>();
        cBoxSize013.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize013.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize013.setBounds(702, 81, 40, 20);
        selectionPanel.add(cBoxSize013);
        
        JComboBox<String> cBoxQuantity013 = new JComboBox<String>();
        cBoxQuantity013.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity013.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity013.setBounds(752, 81, 40, 20);
        selectionPanel.add(cBoxQuantity013);
        
        JLabel lblTitlePharmacy = new JLabel("PHARMACY UNIFORM");
        lblTitlePharmacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitlePharmacy.setBounds(435, 127, 357, 28);
        selectionPanel.add(lblTitlePharmacy);
        
        JCheckBox cboxUnif014 = new JCheckBox("");
        cboxUnif014.setBackground(Color.WHITE);
        cboxUnif014.setBounds(442, 161, 20, 20);
        selectionPanel.add(cboxUnif014);
        
        JLabel lblUnif014 = new JLabel("Pharmacy Blouse with Blue Pocket Piping");
        lblUnif014.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif014.setBounds(472, 163, 170, 15);
        selectionPanel.add(lblUnif014);
        
        JLabel lblProduct014 = new JLabel("NUBEUNIF0014");
        lblProduct014.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct014.setBounds(472, 179, 70, 15);
        selectionPanel.add(lblProduct014);
        
        JLabel lblPrice014 = new JLabel("₱600");
        lblPrice014.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice014.setBounds(652, 163, 40, 15);
        selectionPanel.add(lblPrice014);
        
        JComboBox<String> cBoxSize014 = new JComboBox<String>();
        cBoxSize014.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize014.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize014.setBounds(702, 163, 40, 20);
        selectionPanel.add(cBoxSize014);
        
        JComboBox<String> cBoxQuantity014 = new JComboBox<String>();
        cBoxQuantity014.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity014.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity014.setBounds(752, 163, 40, 20);
        selectionPanel.add(cBoxQuantity014);
        
        JCheckBox cboxUnif015 = new JCheckBox("");
        cboxUnif015.setBackground(Color.WHITE);
        cboxUnif015.setBounds(442, 201, 20, 20);
        selectionPanel.add(cboxUnif015);
        
        JLabel lblUnif015 = new JLabel("Pharmacy Blouse with Blue Pocket Piping");
        lblUnif015.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif015.setBounds(472, 203, 170, 15);
        selectionPanel.add(lblUnif015);
        
        JLabel lblProduct015 = new JLabel("NUBEUNIF0015");
        lblProduct015.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct015.setBounds(472, 219, 85, 15);
        selectionPanel.add(lblProduct015);
        
        JLabel lblPrice015 = new JLabel("₱600");
        lblPrice015.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice015.setBounds(652, 203, 40, 15);
        selectionPanel.add(lblPrice015);
        
        JComboBox<String> cBoxSize015 = new JComboBox<String>();
        cBoxSize015.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize015.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize015.setBounds(702, 201, 40, 20);
        selectionPanel.add(cBoxSize015);
        
        JComboBox<String> cBoxQuantity015 = new JComboBox<String>();
        cBoxQuantity015.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity015.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity015.setBounds(752, 201, 40, 20);
        selectionPanel.add(cBoxQuantity015);
        
        JLabel lblTitleTourism = new JLabel("TOURISM UNIFORM");
        lblTitleTourism.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitleTourism.setBounds(435, 244, 357, 28);
        selectionPanel.add(lblTitleTourism);
        
        JCheckBox cboxUnif016 = new JCheckBox("");
        cboxUnif016.setBackground(Color.WHITE);
        cboxUnif016.setBounds(442, 278, 20, 20);
        selectionPanel.add(cboxUnif016);
        
        JLabel lblUnif016 = new JLabel("Tourism Scarf ");
        lblUnif016.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif016.setBounds(472, 280, 170, 15);
        selectionPanel.add(lblUnif016);
        
        JLabel lblProduct016 = new JLabel("NUBEUNIF0016");
        lblProduct016.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct016.setBounds(472, 296, 70, 15);
        selectionPanel.add(lblProduct016);
        
        JLabel lblPrice016 = new JLabel("₱250");
        lblPrice016.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice016.setBounds(652, 280, 40, 15);
        selectionPanel.add(lblPrice016);
        
        JComboBox<String> cBoxSize016 = new JComboBox<String>();
        cBoxSize016.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize016.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize016.setBounds(702, 280, 40, 20);
        selectionPanel.add(cBoxSize016);
        
        JComboBox<String> cBoxQuantity016 = new JComboBox<String>();
        cBoxQuantity016.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity016.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity016.setBounds(752, 280, 40, 20);
        selectionPanel.add(cBoxQuantity016);
        
        JCheckBox cboxUnif017 = new JCheckBox("");
        cboxUnif017.setBackground(Color.WHITE);
        cboxUnif017.setBounds(442, 318, 20, 20);
        selectionPanel.add(cboxUnif017);
        
        JLabel lblUnif017 = new JLabel("Tourism Vest (Unisex)");
        lblUnif017.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif017.setBounds(472, 320, 170, 15);
        selectionPanel.add(lblUnif017);
        
        JLabel lblProduct017 = new JLabel("NUBEUNIF0017");
        lblProduct017.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct017.setBounds(472, 336, 70, 15);
        selectionPanel.add(lblProduct017);
        
        JLabel lblPrice017 = new JLabel("₱560");
        lblPrice017.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice017.setBounds(652, 320, 40, 15);
        selectionPanel.add(lblPrice017);
        
        JComboBox<String> cBoxSize017 = new JComboBox<String>();
        cBoxSize017.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize017.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize017.setBounds(702, 318, 40, 20);
        selectionPanel.add(cBoxSize017);
        
        JComboBox<String> cBoxQuantity017 = new JComboBox<String>();
        cBoxQuantity017.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity017.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity017.setBounds(752, 318, 40, 20);
        selectionPanel.add(cBoxQuantity017);
        
        JCheckBox cboxUnif018 = new JCheckBox("");
        cboxUnif018.setBackground(Color.WHITE);
        cboxUnif018.setBounds(442, 361, 20, 20);
        selectionPanel.add(cboxUnif018);
        
        JLabel lblUnif018 = new JLabel("Tourism Blazer");
        lblUnif018.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif018.setBounds(472, 363, 170, 15);
        selectionPanel.add(lblUnif018);
        
        JLabel lblProduct018 = new JLabel("NUBEUNIF0018");
        lblProduct018.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct018.setBounds(472, 379, 70, 15);
        selectionPanel.add(lblProduct018);
        
        JLabel lblPrice018 = new JLabel("₱1260");
        lblPrice018.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice018.setBounds(652, 363, 40, 15);
        selectionPanel.add(lblPrice018);
        
        JComboBox<String> cBoxSize018 = new JComboBox<String>();
        cBoxSize018.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize018.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize018.setBounds(702, 361, 40, 20);
        selectionPanel.add(cBoxSize018);
        
        JComboBox<String> cBoxQuantity018 = new JComboBox<String>();
        cBoxQuantity018.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity018.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity018.setBounds(752, 361, 40, 20);
        selectionPanel.add(cBoxQuantity018);
        
        JCheckBox cboxUnif019 = new JCheckBox("");
        cboxUnif019.setBackground(Color.WHITE);
        cboxUnif019.setBounds(442, 404, 20, 20);
        selectionPanel.add(cboxUnif019);
        
        JLabel lblUnif019 = new JLabel("Tourism Skirt");
        lblUnif019.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif019.setBounds(472, 406, 170, 15);
        selectionPanel.add(lblUnif019);
        
        JLabel lblProduct019 = new JLabel("NUBEUNIF0019");
        lblProduct019.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct019.setBounds(472, 422, 70, 15);
        selectionPanel.add(lblProduct019);
        
        JLabel lblPrice019 = new JLabel("₱560");
        lblPrice019.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice019.setBounds(652, 406, 40, 15);
        selectionPanel.add(lblPrice019);
        
        JComboBox<String> cBoxSize019 = new JComboBox<String>();
        cBoxSize019.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize019.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize019.setBounds(702, 404, 40, 20);
        selectionPanel.add(cBoxSize019);
        
        JComboBox<String> cBoxQuantity019 = new JComboBox<String>();
        cBoxQuantity019.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity019.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity019.setBounds(752, 404, 40, 20);
        selectionPanel.add(cBoxQuantity019);
        
        JCheckBox cboxUnif020 = new JCheckBox("");
        cboxUnif020.setBackground(Color.WHITE);
        cboxUnif020.setBounds(442, 447, 20, 20);
        selectionPanel.add(cboxUnif020);
        
        JLabel lblUnif020 = new JLabel("Tourism Coat");
        lblUnif020.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif020.setBounds(472, 449, 170, 15);
        selectionPanel.add(lblUnif020);
        
        JLabel lblProduct020 = new JLabel("NUBEUNIF0020");
        lblProduct020.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct020.setBounds(472, 465, 70, 15);
        selectionPanel.add(lblProduct020);
        
        JLabel lblPrice020 = new JLabel("₱1260");
        lblPrice020.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice020.setBounds(652, 449, 40, 15);
        selectionPanel.add(lblPrice020);
        
        JComboBox<String> cBoxSize020 = new JComboBox<String>();
        cBoxSize020.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize020.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize020.setBounds(702, 447, 40, 20);
        selectionPanel.add(cBoxSize020);
        
        JComboBox<String> cBoxQuantity020 = new JComboBox<String>();
        cBoxQuantity020.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity020.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity020.setBounds(752, 447, 40, 20);
        selectionPanel.add(cBoxQuantity020);
        
        JCheckBox cboxUnif021 = new JCheckBox("");
        cboxUnif021.setBackground(Color.WHITE);
        cboxUnif021.setBounds(442, 492, 20, 20);
        selectionPanel.add(cboxUnif021);
        
        JLabel lblUnif021 = new JLabel("Tourism Pants");
        lblUnif021.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif021.setBounds(472, 494, 170, 15);
        selectionPanel.add(lblUnif021);
        
        JLabel lblProduct021 = new JLabel("NUBEUNIF0021");
        lblProduct021.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct021.setBounds(472, 510, 70, 15);
        selectionPanel.add(lblProduct021);
        
        JLabel lblPrice021 = new JLabel("₱670");
        lblPrice021.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice021.setBounds(652, 494, 40, 15);
        selectionPanel.add(lblPrice021);
        
        JComboBox<String> cBoxSize021 = new JComboBox<String>();
        cBoxSize021.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize021.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize021.setBounds(702, 492, 40, 20);
        selectionPanel.add(cBoxSize021);
        
        JComboBox<String> cBoxQuantity021 = new JComboBox<String>();
        cBoxQuantity021.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity021.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity021.setBounds(752, 492, 40, 20);
        selectionPanel.add(cBoxQuantity021);
        
        
        JLabel lblTitleHM = new JLabel("HOSPITALITY & MANAGEMENT UNIFORM");
        lblTitleHM.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitleHM.setBounds(836, 10, 357, 28);
        selectionPanel.add(lblTitleHM);
        
        JCheckBox cboxUnif022 = new JCheckBox("");
        cboxUnif022.setBackground(Color.WHITE);
        cboxUnif022.setBounds(843, 39, 20, 20);
        selectionPanel.add(cboxUnif022);
        
        JLabel lblUnif022 = new JLabel("H&M Neckerchief ");
        lblUnif022.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif022.setBounds(873, 41, 170, 15);
        selectionPanel.add(lblUnif022);
        
        JLabel lblProduct022 = new JLabel("NUBEUNIF0022");
        lblProduct022.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct022.setBounds(873, 57, 70, 15);
        selectionPanel.add(lblProduct022);
        
        JLabel lblPrice022 = new JLabel("₱100");
        lblPrice022.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice022.setBounds(1053, 41, 40, 15);
        selectionPanel.add(lblPrice022);
        
        JComboBox<String> cBoxSize022 = new JComboBox<String>();
        cBoxSize022.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize022.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize022.setBounds(1103, 41, 40, 20);
        selectionPanel.add(cBoxSize022);
        
        JComboBox<String> cBoxQuantity022 = new JComboBox<String>();
        cBoxQuantity022.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity022.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity022.setBounds(1153, 41, 40, 20);
        selectionPanel.add(cBoxQuantity022);
        
        JCheckBox cboxUnif023 = new JCheckBox("");
        cboxUnif023.setBackground(Color.WHITE);
        cboxUnif023.setBounds(843, 79, 20, 20);
        selectionPanel.add(cboxUnif023);
        
        JLabel lblUnif023 = new JLabel("H&M Blouse ");
        lblUnif023.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif023.setBounds(873, 81, 170, 15);
        selectionPanel.add(lblUnif023);
        
        JLabel lblProduct023 = new JLabel("NUBEUNIF0023");
        lblProduct023.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct023.setBounds(873, 97, 70, 15);
        selectionPanel.add(lblProduct023);
        
        JLabel lblPrice023 = new JLabel("₱690");
        lblPrice023.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice023.setBounds(1053, 81, 40, 15);
        selectionPanel.add(lblPrice023);
        
        JComboBox<String> cBoxSize023 = new JComboBox<String>();
        cBoxSize023.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize023.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize023.setBounds(1103, 81, 40, 20);
        selectionPanel.add(cBoxSize023);
        
        JComboBox<String> cBoxQuantity023 = new JComboBox<String>();
        cBoxQuantity023.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity023.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity023.setBounds(1153, 81, 40, 20);
        selectionPanel.add(cBoxQuantity023);
        
        JCheckBox cboxUnif024 = new JCheckBox("");
        cboxUnif024.setBackground(Color.WHITE);
        cboxUnif024.setBounds(843, 118, 20, 20);
        selectionPanel.add(cboxUnif024);
        
        JLabel lblUnif024 = new JLabel("H&M Blazer");
        lblUnif024.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif024.setBounds(873, 120, 170, 15);
        selectionPanel.add(lblUnif024);
        
        JLabel lblProduct024 = new JLabel("NUBEUNIF0024");
        lblProduct024.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct024.setBounds(873, 136, 70, 15);
        selectionPanel.add(lblProduct024);
        
        JLabel lblPrice024 = new JLabel("₱1200");
        lblPrice024.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice024.setBounds(1053, 120, 40, 15);
        selectionPanel.add(lblPrice024);
        
        JComboBox<String> cBoxSize024 = new JComboBox<String>();
        cBoxSize024.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize024.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize024.setBounds(1103, 118, 40, 20);
        selectionPanel.add(cBoxSize024);
        
        JComboBox<String> cBoxQuantity024 = new JComboBox<String>();
        cBoxQuantity024.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity024.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity024.setBounds(1153, 118, 40, 20);
        selectionPanel.add(cBoxQuantity024);
        
        JCheckBox cboxUnif025 = new JCheckBox("");
        cboxUnif025.setBackground(Color.WHITE);
        cboxUnif025.setBounds(843, 161, 20, 20);
        selectionPanel.add(cboxUnif025);
        
        JLabel lblUnif025 = new JLabel("H&M Vest - Female");
        lblUnif025.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif025.setBounds(873, 163, 170, 15);
        selectionPanel.add(lblUnif025);
        
        JLabel lblProduct025 = new JLabel("NUBEUNIF0025");
        lblProduct025.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct025.setBounds(873, 179, 70, 15);
        selectionPanel.add(lblProduct025);
        
        JLabel lblPrice025 = new JLabel("₱495");
        lblPrice025.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice025.setBounds(1053, 163, 40, 15);
        selectionPanel.add(lblPrice025);
        
        JComboBox<String> cBoxSize025 = new JComboBox<String>();
        cBoxSize025.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize025.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize025.setBounds(1103, 161, 40, 20);
        selectionPanel.add(cBoxSize025);
        
        JComboBox<String> cBoxQuantity025 = new JComboBox<String>();
        cBoxQuantity025.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity025.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity025.setBounds(1153, 161, 40, 20);
        selectionPanel.add(cBoxQuantity025);
        
        JCheckBox cboxUnif026 = new JCheckBox("");
        cboxUnif026.setBackground(Color.WHITE);
        cboxUnif026.setBounds(843, 204, 20, 20);
        selectionPanel.add(cboxUnif026);
        
        JLabel lblUnif026 = new JLabel("H&M Skirt");
        lblUnif026.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif026.setBounds(873, 206, 170, 15);
        selectionPanel.add(lblUnif026);
        
        JLabel lblProduct026 = new JLabel("NUBEUNIF0026");
        lblProduct026.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct026.setBounds(873, 222, 70, 15);
        selectionPanel.add(lblProduct026);
        
        JLabel lblPrice026 = new JLabel("₱480");
        lblPrice026.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice026.setBounds(1053, 206, 40, 15);
        selectionPanel.add(lblPrice026);
        
        JComboBox<String> cBoxSize026 = new JComboBox<String>();
        cBoxSize026.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize026.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize026.setBounds(1103, 204, 40, 20);
        selectionPanel.add(cBoxSize026);
        
        JComboBox<String> cBoxQuantity026 = new JComboBox<String>();
        cBoxQuantity026.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity026.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity026.setBounds(1153, 204, 40, 20);
        selectionPanel.add(cBoxQuantity026);
        
        JCheckBox cboxUnif027 = new JCheckBox("");
        cboxUnif027.setBackground(Color.WHITE);
        cboxUnif027.setBounds(843, 243, 20, 20);
        selectionPanel.add(cboxUnif027);
        
        JLabel lblUnif027 = new JLabel("H&M Polo Longsleeves");
        lblUnif027.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif027.setBounds(873, 245, 170, 15);
        selectionPanel.add(lblUnif027);
        
        JLabel lblProduct027 = new JLabel("NUBEUNIF0027");
        lblProduct027.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct027.setBounds(873, 261, 70, 15);
        selectionPanel.add(lblProduct027);
        
        JLabel lblPrice027 = new JLabel("₱820");
        lblPrice027.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice027.setBounds(1053, 245, 40, 15);
        selectionPanel.add(lblPrice027);
        
        JComboBox<String> cBoxSize027 = new JComboBox<String>();
        cBoxSize027.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize027.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize027.setBounds(1103, 243, 40, 20);
        selectionPanel.add(cBoxSize027);
        
        JComboBox<String> cBoxQuantity027 = new JComboBox<String>();
        cBoxQuantity027.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity027.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity027.setBounds(1153, 243, 40, 20);
        selectionPanel.add(cBoxQuantity027);

        
        JCheckBox cboxUnif028 = new JCheckBox("");
        cboxUnif028.setBackground(Color.WHITE);
        cboxUnif028.setBounds(843, 280, 20, 20);
        selectionPanel.add(cboxUnif028);
        
        JLabel lblUnif028 = new JLabel("H&M Coat");
        lblUnif028.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif028.setBounds(873, 282, 170, 15);
        selectionPanel.add(lblUnif028);
        
        JLabel lblProduct028 = new JLabel("NUBEUNIF0028");
        lblProduct028.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct028.setBounds(873, 298, 70, 15);
        selectionPanel.add(lblProduct028);
        
        JLabel lblPrice028 = new JLabel("₱1260");
        lblPrice028.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice028.setBounds(1053, 282, 40, 15);
        selectionPanel.add(lblPrice028);
        
        JComboBox<String> cBoxSize028 = new JComboBox<String>();
        cBoxSize028.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize028.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize028.setBounds(1103, 280, 40, 20);
        selectionPanel.add(cBoxSize028);
        
        JComboBox<String> cBoxQuantity028 = new JComboBox<String>();
        cBoxQuantity028.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity028.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity028.setBounds(1153, 280, 40, 20);
        selectionPanel.add(cBoxQuantity028);
        
        JCheckBox cboxUnif029 = new JCheckBox("");
        cboxUnif029.setBackground(Color.WHITE);
        cboxUnif029.setBounds(843, 323, 20, 20);
        selectionPanel.add(cboxUnif029);
        
        JLabel lblUnif029 = new JLabel("H&M Vest - Male");
        lblUnif029.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif029.setBounds(873, 325, 170, 15);
        selectionPanel.add(lblUnif029);
        
        JLabel lblProduct029 = new JLabel("NUBEUNIF0029");
        lblProduct029.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct029.setBounds(873, 341, 70, 15);
        selectionPanel.add(lblProduct029);
        
        JLabel lblPrice029 = new JLabel("₱590");
        lblPrice029.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice029.setBounds(1053, 325, 40, 15);
        selectionPanel.add(lblPrice029);
        
        JComboBox<String> cBoxSize029 = new JComboBox<String>();
        cBoxSize029.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize029.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize029.setBounds(1103, 323, 40, 20);
        selectionPanel.add(cBoxSize029);
        
        JComboBox<String> cBoxQuantity029 = new JComboBox<String>();
        cBoxQuantity029.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity029.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity029.setBounds(1153, 323, 40, 20);
        selectionPanel.add(cBoxQuantity029);
        
        JCheckBox cboxUnif030 = new JCheckBox("");
        cboxUnif030.setBackground(Color.WHITE);
        cboxUnif030.setBounds(843, 368, 20, 20);
        selectionPanel.add(cboxUnif030);
        
        JLabel lblUnif030 = new JLabel("H&M Pants");
        lblUnif030.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif030.setBounds(873, 370, 170, 15);
        selectionPanel.add(lblUnif030);
        
        JLabel lblProduct030 = new JLabel("NUBEUNIF0030");
        lblProduct030.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct030.setBounds(873, 386, 70, 15);
        selectionPanel.add(lblProduct030);
        
        JLabel lblPrice030 = new JLabel("₱670");
        lblPrice030.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice030.setBounds(1053, 370, 40, 15);
        selectionPanel.add(lblPrice030);
        
        JComboBox<String> cBoxSize030 = new JComboBox<String>();
        cBoxSize030.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize030.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize030.setBounds(1103, 368, 40, 20);
        selectionPanel.add(cBoxSize030);
        
        JComboBox<String> cBoxQuantity030 = new JComboBox<String>();
        cBoxQuantity030.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity030.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity030.setBounds(1153, 368, 40, 20);
        selectionPanel.add(cBoxQuantity030);
    
        
        JLabel lblTitlePE = new JLabel("PE & NSTP UNIFORM");
        lblTitlePE.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTitlePE.setBounds(836, 417, 357, 28);
        selectionPanel.add(lblTitlePE);
        
        JCheckBox cboxUnif031 = new JCheckBox("");
        cboxUnif031.setBackground(Color.WHITE);
        cboxUnif031.setBounds(843, 446, 20, 20);
        selectionPanel.add(cboxUnif031);
        
        JLabel lblUnif031 = new JLabel("PE T-Shirt");
        lblUnif031.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif031.setBounds(873, 448, 170, 15);
        selectionPanel.add(lblUnif031);
        
        JLabel lblProduct031 = new JLabel("NUBEUNIF0031");
        lblProduct031.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct031.setBounds(873, 464, 70, 15);
        selectionPanel.add(lblProduct031);
        
        JLabel lblPrice031 = new JLabel("₱260");
        lblPrice031.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice031.setBounds(1053, 448, 40, 15);
        selectionPanel.add(lblPrice031);
        
        JComboBox<String> cBoxSize031 = new JComboBox<String>();
        cBoxSize031.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize031.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize031.setBounds(1103, 448, 40, 20);
        selectionPanel.add(cBoxSize031);
        
        JComboBox<String> cBoxQuantity031 = new JComboBox<String>();
        cBoxQuantity031.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity031.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity031.setBounds(1153, 448, 40, 20);
        selectionPanel.add(cBoxQuantity031);
        
        JCheckBox cboxUnif032 = new JCheckBox("");
        cboxUnif032.setBackground(Color.WHITE);
        cboxUnif032.setBounds(843, 486, 20, 20);
        selectionPanel.add(cboxUnif032);
        
        JLabel lblUnif032 = new JLabel("NSTP T-Shirt");
        lblUnif032.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif032.setBounds(873, 488, 170, 15);
        selectionPanel.add(lblUnif032);
        
        JLabel lblProduct032 = new JLabel("NUBEUNIF0032");
        lblProduct032.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct032.setBounds(873, 504, 70, 15);
        selectionPanel.add(lblProduct032);
        
        JLabel lblPrice032 = new JLabel("₱260");
        lblPrice032.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice032.setBounds(1053, 488, 40, 15);
        selectionPanel.add(lblPrice032);
        
        JComboBox<String> cBoxSize032 = new JComboBox<String>();
        cBoxSize032.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize032.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize032.setBounds(1103, 488, 40, 20);
        selectionPanel.add(cBoxSize032);
        
        JComboBox<String> cBoxQuantity032 = new JComboBox<String>();
        cBoxQuantity032.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity032.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity032.setBounds(1153, 488, 40, 20);
        selectionPanel.add(cBoxQuantity032);
        
        JCheckBox cboxUnif034 = new JCheckBox("");
        cboxUnif034.setBackground(Color.WHITE);
        cboxUnif034.setBounds(843, 525, 20, 20);
        selectionPanel.add(cboxUnif034);
        
        JLabel lblUnif034 = new JLabel("PE Jogging Pants");
        lblUnif034.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif034.setBounds(873, 527, 170, 15);
        selectionPanel.add(lblUnif034);
        
        JLabel lblProduct034 = new JLabel("NUBEUNIF0033");
        lblProduct034.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct034.setBounds(873, 543, 70, 15);
        selectionPanel.add(lblProduct034);
        
        JLabel lblPrice034 = new JLabel("₱360");
        lblPrice034.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice034.setBounds(1053, 527, 40, 15);
        selectionPanel.add(lblPrice034);
        
        JComboBox<String> cBoxSize034 = new JComboBox<String>();
        cBoxSize034.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize034.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize034.setBounds(1103, 525, 40, 20);
        selectionPanel.add(cBoxSize034);
        
        JComboBox<String> cBoxQuantity034 = new JComboBox<String>();
        cBoxQuantity034.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity034.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity034.setBounds(1153, 525, 40, 20);
        selectionPanel.add(cBoxQuantity034);
        
     // go to cart button
        JButton btnCart = new JButton("Go to Cart");
        btnCart.setBounds(560, 551, 100, 25);
        selectionPanel.add(btnCart);
        btnCart.addActionListener(e -> {
            String selectedItems = getSelectedItems();
            preOrderCart cart = new preOrderCart(selectedItems);
            cart.cartFrame.setVisible(true);
        });
   
        
        
        
//        // go to cart button
//        JButton btnCart = new JButton("Go to Cart");
//        btnCart.setBounds(500, 600, 100, 25);
//        selectionFrame.getContentPane().add(btnCart);
//        btnCart.addActionListener(e -> {
//            String selectedItems = getSelectedItems();
//            preOrderCart cart = new preOrderCart(selectedItems);
//            cart.cartFrame.setVisible(true);
//        });

        
        JLabel lblSelectionBanner = new JLabel("");
        lblSelectionBanner.setHorizontalAlignment(SwingConstants.CENTER);
        lblSelectionBanner.setIcon(new ImageIcon(preOrderSelection.class.getResource("Main Banner.png")));
        lblSelectionBanner.setBounds(0, 0, 1170, 120);
        selectionFrame.getContentPane().add(lblSelectionBanner);
    }
    
    private String getSelectedItems() {
        StringBuilder selectedItems = new StringBuilder();
        if (cboxUnif001.isSelected()) {
            int quantity001 = Integer.parseInt((String) cBoxQuantity001.getSelectedItem());
            int totalAmount001 = quantity001 * 560; 
            selectedItems.append("<html>PRODUCT NAME: Traditional Uniform Blouse<br/>")
                         .append("PRODUCT ID: NUBEUNIF0001<br/>")
                         .append("PRICE: ₱560<br/>")
                         .append("SIZE: ").append(cBoxSize001.getSelectedItem()).append("<br/>")
                         .append("QUANTITY: ").append(quantity001).append("<br/>")
                         .append("TOTAL AMOUNT: ₱").append(totalAmount001).append("</html>");
        }
        else if (cboxUnif002.isSelected()) {
            int quantity002 = Integer.parseInt((String) cBoxQuantity002.getSelectedItem());
            int totalAmount002 = quantity002 * 560; 
            if (selectedItems.length() > 0) {
                // If data for the first checkbox is already added, add a separator
                selectedItems.append("<br/><br/>");
            }
            selectedItems.append("<html>PRODUCT NAME: Traditional Uniform Polo<br/>")
                         .append("PRODUCT ID: NUBEUNIF0002<br/>")
                         .append("PRICE: ₱560<br/>")
                         .append("SIZE: ").append(cBoxSize002.getSelectedItem()).append("<br/>")
                         .append("QUANTITY: ").append(quantity002).append("<br/>")
                         .append("TOTAL AMOUNT: ₱").append(totalAmount002).append("</html>");
        }
        else {
        
        }
        return selectedItems.toString();
    }
    
    
            
       
    
    
}
