package ExpenseTrackerJavaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
public class ExpenseTrackerProject extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField income;
	private static JTextField spend;
	public static int saving = 0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpenseTrackerProject frame = new ExpenseTrackerProject();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ExpenseTrackerProject() {
		setResizable(false);
		setTitle("Expense Tracker Project By Manu Tyagi\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Manu\\Downloads\\R-removebg-preview.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1154, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TitleProject = new JLabel("Expense Tracker Project");
		TitleProject.setHorizontalAlignment(SwingConstants.CENTER);
		TitleProject.setHorizontalTextPosition(SwingConstants.CENTER);
		TitleProject.setBackground(new Color(255, 255, 255));
		TitleProject.setForeground(new Color(0, 0, 0));
		TitleProject.setFont(new Font("Ubuntu Mono", Font.BOLD, 30));
		TitleProject.setLabelFor(TitleProject);
		TitleProject.setBounds(163, 56, 476, 51);
		contentPane.add(TitleProject);
		
		JPanel panel = new JPanel();
		panel.setBounds(163, 66, 476, 41);
		contentPane.add(panel);
		
		JLabel MonthlyIncome = new JLabel("Monthly Income");
		MonthlyIncome.setFont(new Font("Ubuntu Mono", Font.BOLD, 23));
		MonthlyIncome.setForeground(new Color(255, 255, 255));
		MonthlyIncome.setBounds(163, 158, 199, 29);
		contentPane.add(MonthlyIncome);
		
		JLabel lblTotalSpend = new JLabel("Total Spend");
		lblTotalSpend.setForeground(Color.WHITE);
		lblTotalSpend.setFont(new Font("Ubuntu Mono", Font.BOLD, 23));
		lblTotalSpend.setBounds(163, 231, 199, 29);
		contentPane.add(lblTotalSpend);
		
		income = new JTextField();
		income.setName("income");
		income.setToolTipText("only numeric numbers are allowed");
		income.setFont(new Font("Ubuntu Mono", Font.BOLD, 23));
		income.setBounds(383, 155, 256, 35);
		contentPane.add(income);
		income.setColumns(10);
		
		JLabel Expense_Tracker_Logo = new JLabel("New label");
		Expense_Tracker_Logo.setIconTextGap(10);
		Expense_Tracker_Logo.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\Expense-Tracker-logo.png"));
		Expense_Tracker_Logo.setBounds(755, 10, 304, 379);
		contentPane.add(Expense_Tracker_Logo);
		
		JButton SUBMIT = new JButton("SUBMIT");
		SUBMIT.setBackground(new Color(255, 255, 255));
		SUBMIT.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 saving = Integer.parseInt(income.getText()) - Integer.parseInt(spend.getText());
				try {
					
					if (saving >=0) {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root");
					PreparedStatement ps = con.prepareStatement( "insert into financial_data1  values(?,?)");
					ps.setInt(1,Integer.parseInt( income.getText()));
					ps.setInt(2,saving);		
					int i = ps.executeUpdate();		
					JOptionPane.showMessageDialog(null,i+" Record Added");
					ps.close();
					con.close();
					YourSaving ys = new YourSaving();
					setVisible(false);
					ys.setVisible(true);
					}
					
					else {
						JOptionPane.showMessageDialog(null,"You Spend More than Your Income By " + saving +" Rupees");
					}
					
					
				} catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null,"You Encountered an Error" );
				}
			}
		});
		SUBMIT.setFont(new Font("Ubuntu Mono", Font.BOLD, 27));
		SUBMIT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SUBMIT.setBounds(163, 312, 476, 51);
		contentPane.add(SUBMIT);
		
		spend = new JTextField();
		spend.setName("spend");
		spend.setToolTipText("only numeric numbers are allowed");
		spend.setFont(new Font("Ubuntu Mono", Font.BOLD, 23));
		spend.setColumns(10);
		spend.setBounds(383, 228, 256, 35);
		contentPane.add(spend);
	}
}

