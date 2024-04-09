package ExpenseTrackerJava;


public class ShowSavingDetails {
    public void displaySavedDetails(double[] savings,int k) {
        System.out.println("Saved Details:");
        for (int i = 0; i < k; i++) {
            System.out.printf("Entry %d: %.1f%n\n", i + 1, savings[i]);
        }
    }
}

