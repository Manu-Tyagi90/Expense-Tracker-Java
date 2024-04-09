package ExpenseTrackerJava;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExpenseTrackerJava {
	 static int ab = 1;
	 static int a=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			while(ab!=0) {
			System.out.println("ADD 1 for Adding Details ");
			
			a = scan.nextInt();
			//a = scan.nextLine();
			
			switch(a) {
			case 1:
				SavingsDetail sd = new SavingsDetail();
				sd.Hello();
				break;
			default :
				System.out.println("You Write a Wrong KeyWord");
				}
			System.out.println("Enter 0 to Exit Else press any key");
			ab = scan.nextInt();
			
			
			}
				
		} 
		
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error Hai Error" + e);
		} 

	}

}
