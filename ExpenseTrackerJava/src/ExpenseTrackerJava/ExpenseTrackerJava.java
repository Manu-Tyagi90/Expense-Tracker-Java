package ExpenseTrackerJava;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExpenseTrackerJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ab = 1;
		try {
			while(ab!=0) {
			System.out.println("Enter 1 for Adding Details ");
			int a = scan.nextInt();
			switch(a) {
			case 1:
				SavingsDetail sd = new SavingsDetail();
				sd.Hello();
				break;
			default :
				System.out.println("Please Enter Either 1 or 2");
				}
			System.out.println("Enter 0 to Exit Else press any key");
			ab = scan.nextInt();
			scan.close();
			
			}
			
			
			
			
		} 
		
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error Hai Error" + e);
		} 

	}

}
