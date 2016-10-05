/*
* FILENAME:
*  Employee.java
*
* DESCRIPTION:
*  Implements an Employee class that holds the following:
*  	-First Name
*  	-Last Name
*  	-Phone Number
*  	-Hire Date
*  	-Salary
*
* AUTHOR:
*  Daniel Shevtsov (SID: 200351253)
*/

package com.shevtsod;

public class Employee {
	private String 	_sFName;
	private String 	_sLName;
	private String	_sPNumber;
	private String	_sHDate;
	private double	_dSalary;
	
	//Create employee with default values.
	public Employee() {
		_sFName = _sLName = _sHDate = _sPNumber = "";
		_dSalary = 0;
	}
	
	//Create employee with given values.
	public Employee(String sFName, String sLName, String sPNumber, String sHDate, double dSalary) {
		_sFName = sFName;
		_sLName = sLName;
		_sPNumber = sPNumber;
		_sHDate = sHDate;
		_dSalary = dSalary;
	}
	
	//Getters
	public String getFName() 	{ return _sFName; }
	public String getLName()	{ return _sLName; }
	public String getPNumber()	{ return _sPNumber; }
	public String getHDate()	{ return _sHDate; }
	public double getSalary()	{ return _dSalary; }
}