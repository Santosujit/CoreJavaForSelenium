package InterfaceConceptThruHospitalExample;

public interface USMedicalGuideLines extends WHO {// Interface to Interface Parent and Child relationship

	int min_fee = 10;// min_fee is static and final in nature. every hospital wanting to open a branch in USA should follow that
						// minimum fee is 10

	public void OncologyServices();// no method body---abstract methods

	public void SkinCareServices();// abstract methods can't have static keyword inside Interface

	public void RadiologyServices();// US Govt added this Services

	// static methods with method body is allowed after JDK 1.8

	public static void Services_911() {
		System.out.println("US---911 Services");// These are the standard rules you can't override

	}

	// default method--you can't override the default method--but still it's a non-static method

	default void Internship() {
		System.out.println("US---Internship of 1 Years");
	}

}
