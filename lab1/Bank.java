/*
* FILENAME:
*  Bank.java
*
* DESCRIPTION:
*  Test program for SavingsAccount class.
*
* AUTHOR:
*  Daniel Shevtsov (SID: 200351253)
*/

//Remove comment to include package from Phase 1 or 2 of the assignment.
import phase1.*;
//import phase2.*;

public class Bank {
	public static void main (String[] args) {
		testSavingsAccount(0.04);
		testSavingsAccount(0.05);
	}
	
	public static void testSavingsAccount (double interestRate) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		saver1.modifyInterestRate(interestRate);
		
		//Print initial conditions
		System.out.println("Created saver1 and saver2.");
		System.out.print("saver 1 initial savings balance: $");
		System.out.format("%.2f", saver1.getSavingsBalance());
		System.out.println("");
		System.out.print("saver 2 initial savings balance: $");
		System.out.format("%.2f", saver2.getSavingsBalance());
		System.out.println("");
		System.out.println("Monthly interest: " + (saver2.getAnnualInterestRate() * 100) + "%");
		
		//Compound interest monthly for a year on both accounts.
		System.out.println("Calculating new savings after one year of compounding interest.");
		saver1.calculateAnnualSavings();
		saver2.calculateAnnualSavings();
		
		//Output final conditions.
		System.out.print("saver 1 final savings balance: $");
		System.out.format("%.2f", saver1.getSavingsBalance());
		System.out.println("");
		System.out.print("saver 2 final savings balance: $");
		System.out.format("%.2f", saver2.getSavingsBalance());
		System.out.println("\n");
	}
}