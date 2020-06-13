import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Patient {
	private JFrame frame;
	public Patient() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,1101, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("E-Hospital");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp\\eclipse-workspace\\HospitalManagment\\Img\\Hosp.png"));
		frame.getContentPane().setBackground(new Color(240, 255, 240));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Patient");
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(643, 111, 184, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click\r\n");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(839, 101, 172, 55);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Existing Patient");
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(643, 403, 163, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Click");
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setBounds(839, 405, 172, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(75, 0, 130));
		separator.setBackground(new Color(128, 0, 0));
		separator.setToolTipText("-------------------------------------------------------");
		separator.setBounds(632, 295, 395, -11);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2.setBounds(659, 282, 352, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrEhospautomatesTheClinics = new JTextArea();
		txtrEhospautomatesTheClinics.setForeground(new Color(72, 61, 139));
		txtrEhospautomatesTheClinics.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtrEhospautomatesTheClinics.setTabSize(10);
		txtrEhospautomatesTheClinics.setRows(20);
		txtrEhospautomatesTheClinics.setLineWrap(true);
		txtrEhospautomatesTheClinics.setText("E-HOSP......automates the clinic\u2019s work and optimizes the\r\nutilization of resources instead of only  the storage and \r\npresentation of the information. It balances the occupancy\r\nrates and calculates the number of required employees.\r\nAutomation helps to manage the general process, \r\ndeals with the different healthcare services and \r\nequipment providers on its own, analyzes and sends \r\nnotifications to the user. The purpose of the hospital \r\ninformation system is managing the employee and patient\r\nactivities remotely with immediate access for the \r\nauthorized users. The patient-centric and well-managed\r\ncompany will also ensure a better work environment for their employees.");
		txtrEhospautomatesTheClinics.setBounds(24, 85, 588, 414);
		frame.getContentPane().add(txtrEhospautomatesTheClinics);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(564, 57, -16, 432);
		frame.getContentPane().add(scrollPane);
		
		frame.setVisible(true);
	}
}
