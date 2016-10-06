/*
* FILENAME:
*  Employee.java
*
* DESCRIPTION:
*  Implements a test program for Employee class.
*  Gives a user an interface with three phases:
*  	-Allow user to store information for an array of employees.
*  	-Allow the user to print the employee list by last name alphabetical
*  	 or by largest salary.
*
* AUTHOR:
*  Daniel Shevtsov (SID: 200351253)
*/

package com.shevtsod;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.IOException;

public class Interface {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char userInput;
		Employee[] empList = new Employee[100];
		
		//Print initial menu with instructions.
		System.out.println("EMPLOYEE DATA STORAGE");
		System.out.println("This program allows to enter a list of employees and then\n"
				+ "output the list by alphabetical last name or by highest salary.\n------\n");
		
		//Store first character from input.
		do {
			System.out.println("Press K to input employees from keyboard, F for file input demo.");
			System.out.println("Press Q to quit the program.");
			userInput = in.nextLine().charAt(0);
		} while (
				userInput != 'K' && userInput != 'k' &&
				userInput != 'F' && userInput != 'f' &&
				userInput != 'Q' && userInput != 'q');
		
		//Depending on userInput, perform an action
		// K or k -> read employees from keyboard
		// F or f -> read employees from file
		// Q or q -> quit program
		switch(userInput) {
		case 'K': case 'k':
			readFromKeyboard(empList, in);
			break;
		case 'F': case 'f':
			readFromFile(empList);
			break;
		case 'Q': case 'q': default:
			System.out.println("Terminating.");
			in.close();
			return;
		}
		
		//If reached this point, prompt user to output list or quit.
		//Users can output as many times as they want until they quit.
		do {
			System.out.println("Press 0 to output by last name, 1 by highest salary.");
			System.out.println("Press Q to quit the program.");
			userInput = in.nextLine().charAt(0);
			
			if(userInput == '0' || userInput == '1')
				printEmpList(empList, Character.getNumericValue(userInput));
		} while (
				userInput != 'Q' && userInput != 'q');
		
		System.out.println("Terminating.");
		in.close();
	}
	
	//Read input from the keyboard to fill passed in employee array.
	//Allow user to stop inputting values at any point.
	public static void readFromKeyboard(Employee[] empList, Scanner in) {
		String sFName, sLName, sHDate, sPNumber, sFromInput;
		double dSalary;
		int i = 0;
		
		//The user is given the option to end input before populating an Employee record.
		//If the user decides to input a record, they must populate the full record
		//before they are prompted to quit again.
		//sFromInput:
		//	0 -> Continue
		//	1 -> Quit
		do {
			System.out.println("Press 0 to add an Employee to the list, 1 to quit.");
			sFromInput = in.nextLine();
			if(sFromInput.equals("1"))
				return;
		} while(!sFromInput.equals("0") && !sFromInput.equals("1"));
		
		do {
			//Input First Name
			System.out.println("Enter FIRST NAME and press Enter to confirm:");
			sFName = in.nextLine();
			
			//Input Last Name
			System.out.println("Enter LAST NAME and press Enter to confirm:");
			sLName = in.nextLine();
			
			//Input Phone Number
			System.out.println("Enter PHONE NUMBER and press Enter to confirm:");
			sPNumber = in.nextLine();
			
			//Input Hire Date
			System.out.println("Enter HIRE DATE and press Enter to confirm:");
			sHDate = in.nextLine();
			
			//Input Salary (convert to double)
			System.out.println("Enter SALARY and press Enter to confirm:");
			try {
			dSalary = Double.parseDouble(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Salary is not a valid number. Setting Salary to default $0.00");
				dSalary = 0;
			}
			
			//Create a new cell in the passed in array and populate it with the data.
			empList[i] = new Employee(sFName, sLName, sPNumber, sHDate, dSalary);
			i++;
			
			do {
				System.out.println("Press 0 to add an Employee to the list, 1 to quit.");
				sFromInput = in.nextLine();
				if(sFromInput.equals("1"))
					return;
			} while(!sFromInput.equals("0") && !sFromInput.equals("1"));
			
		} while (!sFromInput.equals("1") && i < 100);
	}
	
	//Read input from a file to automatically fill passed in employee array.
	public static void readFromFile(Employee[] empList) {
		String sFName, sLName, sHDate, sPNumber;
		String[] sFromFile;
		double dSalary;
		int i = 0;

		try {
			Scanner fin = new Scanner(Paths.get("randomData.csv"));
			
			System.out.println("Reading values from \"randomData.csv\"...");
			while(fin.hasNextLine()) {
				//Store the contents of the line separated by commas in a temporary string array.
				sFromFile = fin.nextLine().split(",");
				
				/*
				 * sFromFile indices:
				 * 0 -> First Name
				 * 1 -> Last Name
				 * 2 -> Phone Number
				 * 3 -> Hire Date
				 * 4 -> Salary (need to convert to double)
				 */
				sFName = sFromFile[0];
				sLName = sFromFile[1];
				sPNumber = sFromFile[2];
				sHDate = sFromFile[3];
				dSalary = Double.parseDouble(sFromFile[4]);
				
				//Create a new cell in the passed in array and populate it with the data.
				empList[i] = new Employee(sFName, sLName, sPNumber, sHDate, dSalary);
				i++;
				
			}
			System.out.println("File \"randomData.csv\" has been read successfully.");
			
			fin.close();
		}
		catch (IOException e) {
			System.out.println("Could not find file.");
			return;
		}
	}
	
	//Output the contents of passed in Employee array, one entry per line.
	//Pass in array of Employees and sort mode
	//Sort mode:
	//	0 -> Sort by alphabetical last name
	//	1 -> Sort by highest salary
	public static void printEmpList(Employee[] empList, int sort) {
		int empLength;
		
		if(empList == null || empList[0] == null) {
			System.out.println("Employee list is empty.\n");
			return;
		} else {
			//Get number of initialized array elements.
			empLength = 0;
			for(int i = 0; i < empList.length; i++) {
				if(empList[i] == null)
					break;
				else
					empLength++;
			}
		}
		
		if(sort == 0) {
			System.out.println("Printing list of employees sorted by last name alphabetically:");
			
			//Sort the array such that elements are sorted by comparing last name.
			if(empList != null && empList[0] != null && empList[1] != null) {
				Arrays.sort(empList, 0, empLength, new Comparator<Employee>() {
					@Override
					public int compare(final Employee lhs, Employee rhs) {
						return lhs.getLName().compareTo(rhs.getLName());
					}
				});
			}
			
		} else if (sort == 1) {
			System.out.println("Printing list of employees sorted by highest salary:");
			//Sort the array such that elements are sorted by comparing salary.
			if(empList != null && empList[0] != null && empList[1] != null) {
				Arrays.sort(empList, 0, empLength, new Comparator<Employee>() {
					@Override
					public int compare(final Employee lhs, Employee rhs) {
						if (lhs.getSalary() - rhs.getSalary() < 0)
							return 1;
						else if (lhs.getSalary() - rhs.getSalary() > 0)
							return -1;
						else
							return 0;
					}
				});
			}
		}
		
		for(int i = 0; i < empLength; i++) {
			System.out.printf("%-12s,  %-15s", empList[i].getLName(), empList[i].getFName());
			System.out.printf("%-15s %12s\t", empList[i].getPNumber(), empList[i].getHDate());
			System.out.printf("$%10.2f\n", empList[i].getSalary());
		}
		System.out.print("\n");
	}
}
