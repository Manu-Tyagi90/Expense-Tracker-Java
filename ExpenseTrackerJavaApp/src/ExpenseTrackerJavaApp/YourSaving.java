package ExpenseTrackerJavaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class YourSaving extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YourSaving frame = new YourSaving();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public YourSaving() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Manu\\Downloads\\R-removebg-preview.png"));
		setTitle("Your Saved Money");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1143, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		int saving = ExpenseTrackerProject.saving;
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You Saved ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 47));
		lblNewLabel.setBounds(10, 10, 1119, 112);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 132, 1109, 365);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Rs"+saving);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Ubuntu Mono", Font.BOLD, 99));
		lblNewLabel_1.setBounds(10, 10, 1089, 345);
		panel.add(lblNewLabel_1);
	}

}
