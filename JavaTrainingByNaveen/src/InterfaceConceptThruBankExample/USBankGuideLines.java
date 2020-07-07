package InterfaceConceptThruBankExample;

public interface USBankGuideLines {

	// USBankGuideLines is an Interface, any bank that wants to open bank branches
	// in USA has to implement this Interface. meaning the new bank
	// should give credit, debit, transfermoney services in its own way, but it has
	// to offer these services to customers

	// Multiple inheritance is possible using Interfaces
	// or else only multi level inheritance is possible using class
	
	// static methods with method body is allowed inside Interface after JDK 1.8

	// Inside Interface, define only prototype of methods, only method declaration,
	// no method body is allowed
	// you have to override these methods in child class
	// we can declare variables, and they are by default static, and final in
	// variable value can not be changed, final or constant in nature
	// no static method in interface, so no main method in Interface---why, query
	// objects can not have static methods---why, query
	// all methods inside Interface are abstract in nature meaning no method body is
	// present.
	// we can't create the object of Interface meaning we can't instantiate the
	// Interface---why, query
	// we can't create the constructor of an Interface---why, query
	// Interface is called 100% abstraction

	// USBankGuideLines();//Can't create the constructor of the Interface
	// USBankGuideLines obj = new USBankGuideLines(); //Can't create object of
	// Interface USBankGuideLines

	int min_bal = 100; // min_bal is static and final in nature. Any bank who wants to open a branch in
						// USA has to have minimum balancs 10 dollar

	public void credit();// abstract method---no method body. any bank that wants to open bank branches
							// in USA has to give credit services, has to have credit() method, the business
							// logic (interest rate etc) can be written inside the method body
							// in the specific bank branch's class's (child class) method body

	public void debit();// abstract method---no method body

	public void transfermomney();// abstract method---no method body

}
