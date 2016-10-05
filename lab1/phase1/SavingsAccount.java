/*
* FILENAME:
*  SavingsAccount.java
*
* DESCRIPTION:
*  Implements a savings account that allows monthly interest be
*  calculated and modified.
*
* AUTHOR:
*  Daniel Shevtsov (SID: 200351253)
*/

package phase1;	//Monthly interest

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount () { savingsBalance = 0.0; }
	public SavingsAccount (double newSavingsBalance) { savingsBalance = newSavingsBalance; }
	
	public double getAnnualInterestRate () { return annualInterestRate; }
	public double getSavingsBalance () { return savingsBalance; }
	
	public double calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;
		return  monthlyInterest;
	}
	
	public double calculateAnnualSavings() {
		for(int i = 0; i < 12; i++) {
			calculateMonthlyInterest();
		}
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}