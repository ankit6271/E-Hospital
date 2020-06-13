import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontPage {

	private JFrame frmEhospital;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
					window.frmEhospital.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrontPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEhospital = new JFrame();
		frmEhospital.setTitle("E-Hospital");
		frmEhospital.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp\\eclipse-workspace\\HospitalManagment\\Img\\Hosp.png"));
		frmEhospital.getContentPane().setBackground(new Color(240, 255, 240));
		frmEhospital.setBounds(100, 100, 1101, 686);
		frmEhospital.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEhospital.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Patient");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(851, 201, 127, 25);
		frmEhospital.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Patient();
			}			
		});
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Doctor");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(851, 303, 127, 25);
		frmEhospital.getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Doctor();
			}	
		});
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Staff");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(851, 409, 127, 25);
		frmEhospital.getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Staff();
			}		
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Img\\Logo.png"));
		lblNewLabel.setBounds(57, 43, 701, 553);
		frmEhospital.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@ E-Hospital");
		lblNewLabel_1.setForeground(new Color(51, 51, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(925, 591, 133, 35);
		frmEhospital.getContentPane().add(lblNewLabel_1);
	}
}
