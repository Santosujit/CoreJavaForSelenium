package InterfaceConceptThruBankExample;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank(); // hs is the child class object

		hs.credit();// child class object accessing parent interface's overridden methods
		hs.debit();
		hs.transfermomney();

		hs.carLoan();// child class object accessing it's own methods
		hs.educationLoan();

		hs.mutualFund();// child class object accessing parent interface's overridden methods

		System.out.println(USBankGuideLines.min_bal);// child class object accessing parent interface's static variable

		// dynamic polymorphism---what, query
		// child class object can be referred by parent interface's reference variable
		// only and only overridden methods will be called or accessed

		USBankGuideLines us = new HSBCBank();// Parent Interfaces reference variable (us) pointing to child class object
												// (child class object --- new HSBCBank())
		us.credit();
		us.debit();
		us.transfermomney();

		// USBank reference variable can't access BrazilBank or HSBCBank's methods

		// us.educationLoan();//us.carLoan(); ---can't access
		// us.mutualFund(); ---can't access
	}

}
