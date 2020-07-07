package InterfaceConceptThruBankExample;

/*HSBC Bank wants to open banks in US and Brazil. So It has to follow regulations of US and Brazil Bank.
 HSBC Bank has to implement (Rules of) USBank, and BrazilBank. 
 for e.g If HSBC bank wants to open branch in Brazil then it has to offer mutualFund services, the logic of how it wants to offer mutual fund services 
 it can write separately though inside its own class and method body. 
 If HSBC bank wants to open branch in USA then it has to offer credit, debit, transfermomney features or services, 
 the logic of how it wants to offer these services for e.g interest rate in credit can be defined inside child HSBC class and its methods*/

/*if a child class is implementing any interface, then it is mandatory to define/override(have method body) all the methods 
  of parent Interface in the child class, besides child class's own separate methods(services offered)*/

//a particular class can extend(inherit) one calss but can implement multiple interfaces

//HSBCBank is the Child class implementing two parent Interfaces USBankGuideLines, BrazilBankGuideLines

public class HSBCBank implements USBankGuideLines, BrazilBankGuideLines {

	// Below Three methods from USBank are overridden here in the child class
	// you can't create an object or constructor of any interface

	public void credit() {
		System.out.println("HSBC---Credit");
	}

	public void debit() {
		System.out.println("HSBC---Debit");
	}

	public void transfermomney() {
		System.out.println("HSBC---Transfer Money");

	}

	// Below Two methods are HSBCBank's own methods

	public void educationLoan() {
		System.out.println("HSBC---Education Loan");
	}

	public void carLoan() {
		System.out.println("HSBC---Car Loan");
	}

	// BrazilBank's methods are overridden here in the child class

	public void mutualFund() {
		System.out.println("HSBC ----Mutual Fund");

	}

}
