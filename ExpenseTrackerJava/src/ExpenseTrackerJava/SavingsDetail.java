package ExpenseTrackerJava;

import java.util.*;
public class SavingsDetail {
	static int i =0;
	static double[] Saving = new double[100];
	public SavingsDetail(){

	}
	public void Hello() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Monthly Income");
		double MonthlyIncome = scan.nextDouble();
		
		System.out.println("Enter Your Monthly Expenditure");
		double MonthlyExpenditure = scan.nextDouble();
		
		
		Saving [i++] = (MonthlyIncome - MonthlyExpenditure);
		System.out.printf("You Saved "+Saving[i-1]+"\n");
		
		ShowSavingDetails ssd = new ShowSavingDetails();
		ssd.displaySavedDetails(Saving,i);
	}

}
