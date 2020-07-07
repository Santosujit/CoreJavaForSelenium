package InterfaceConceptThruHospitalExample;

public class ApolloHospital extends GlobalpatientData
		implements USMedicalGuideLines, UKMedicalGuideLines, IndianMedicalGuideLines {

	// One child class can extend a parent class and implements multiple interfaces
	// at the same time as shown below
	// A child Interface can extend a Parent Interface (Inehritance)

	// Apollo Hospital is extending GlobalpatientData Class, and implementing three
	// interfaces USMedicalGuideLines,UKMedicalGuideLines,IndianMedicalGuideLines
	// Apollo Hospital is the child class of GlobalpatientData class, and child
	// class of all the three Interfaces

	// suppose Apollo Hospital wants to open one branch in USA, other in UK, and the
	// other in India.
	// Then Apollo Hospital has follow guidelines mentioned by USA,UK,India
	// Then Apollo Hospital (child class) has to implement all the abstarct methods
	// inside all the three parent Interfaces (USA/UK/India)
	// That means Apollo Hospital has to define its own logic inside the methods

	// Suppose for example Apollo Hospital wants to open a branch in USA, then it
	// has to offer OncologyServices as mentioned in
	// USMedicalGuideLines Interface. But how it wants to offer OncologyServices
	// (how many doctors, medicines-- its own logic). It has to override in its own
	// class(child class).
	// Apollo Hospital can have its own methods too. Its own services that it wants
	// to offer to its customers
	// Total 8 overridden methods, and 2 non-overridden methods

	public void OncologyServices() {
		System.out.println("Apollo Hospital overriding OncologyServices method present in the parent interface ");
	}

	public void SkinCareServices() {
		System.out.println("Apollo Hospital overriding SkinCareServices method present in the parent interface ");
	}

	public void EyesServices() {
		System.out.println("Apollo Hospital overriding EyesServices method present in the parent interface ");

	}

	public void CardiologyServices() {
		System.out.println("Apollo Hospital overriding CardiologyServices method present in the parent interface ");

	}

	public void OrthopaedicServices() {
		System.out.println("Apollo Hospital overriding OrthopaedicServices method present in the parent interface ");

	}

	public void YogaServices() {
		System.out.println("Apollo Hospital overriding YogaServices method present in the parent interface ");

	}

	public void MeditationServices() {
		System.out.println("Apollo Hospital overriding MeditationServices method present in the parent interface ");
	}

	public void PsychiatryServices() {
		System.out.println("Apollo Hospital overriding PsychiatryServices method present in the parent interface ");

	}

	// WHO
	@Override
	public void polioServices() {
		System.out.println("Indian Polio System Dosage");// don't know why I am getting error here

	}

//Non over ridden methods--Apollo Hospital's own methods or services offered to customers

	public void Pathology() {
		System.out.println("Apollo Hospital providing its own Pathology Services ");

	}

	public void AyurvedicServices() {
		System.out.println("Apollo Hospital providing its own AyurvedicServices ");

	}

	@Override
	public void RadiologyServices() {
		System.out.println("Apollo Hospital providing its own RadiologyServices "); // This method is common to
																					// USA,India, UK. Once override but
																					// write different logic for each
																					// country

	}

}
