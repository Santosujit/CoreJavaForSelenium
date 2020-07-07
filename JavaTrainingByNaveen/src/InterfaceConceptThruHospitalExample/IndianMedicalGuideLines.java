package InterfaceConceptThruHospitalExample;

public interface IndianMedicalGuideLines {

	public void YogaServices(); // You can't have method body inside a interface. Only declaration or prototype
								// is needed---is it ---query

	public void MeditationServices();// you have to declare here, and overrides these abstarct methods in the child
										// class.

	public void PsychiatryServices();

	public static void DengueServices() {// every hospital should follow this inside India
		System.out.println("Indian---Dengue Services");
	}

	public void RadiologyServices();// India added this later

}
