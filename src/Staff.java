import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Staff {
	private JFrame frame;
	/**
	 * Create the application.
	 */
	public Staff() {
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
		
		frame.setVisible(true);
	}

}
