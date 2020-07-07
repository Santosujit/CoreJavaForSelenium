package InterfaceConceptThruHospitalExample;

public class TestHospital {

	public static void main(String[] args) {

		// USMedicalGuideLines us = new USMedicalGuideLines();////can't create the
		// object of the Interfaces

		ApolloHospital ap = new ApolloHospital();// object of the child class. It can access all the methods of parent
													// interfaces and its own class too

		System.out.println("US Services");
		ap.OncologyServices();
		ap.SkinCareServices();
		ap.RadiologyServices();
		ap.Internship();// Apollo hospital say to its students that they follow US Guidelines.
		USMedicalGuideLines.Services_911();

		System.out.println("**************");
		System.out.println("UK Services");

		ap.EyesServices();
		ap.CardiologyServices();
		ap.OrthopaedicServices();
		ap.RadiologyServices();

		System.out.println("**************");
		System.out.println("Indian Services");

		ap.YogaServices();
		ap.MeditationServices();
		ap.PsychiatryServices();
		IndianMedicalGuideLines.DengueServices();
		ap.RadiologyServices();

		System.out.println("************");
		System.out.println("Apollo Hospital's own Services");

		ap.Pathology();
		ap.AyurvedicServices();

		System.out.println("************");
		System.out.println("GlobalpatientData Services");

		ap.getpatientHistory();

		System.out.println("************");
		System.out.println("Accessing Parent Interface's Variables");

		System.out.println(ap.min_fee);// warning
		System.out.println(USMedicalGuideLines.min_fee);// no war ing as it is called in static way
		// USMedicalGuideLines.min_fee=20;//as it is final variable, you can't change
		// the value

		// top casting---object of child class can be accessed by parent's interface's
		// reference variable

		USMedicalGuideLines us = new ApolloHospital();// new ApolloHospital();---This is the object of child class
		// us is the reference variable of parent interface USMedicalGuideLines

		us.OncologyServices();
		us.SkinCareServices();
		us.Internship();
		us.polioServices();// query in the output
		us.RadiologyServices();

		// us.CardiologyServices();//us reference variable is coming from
		// USMedicalGuideLines interface, so it can't access any other
		// interface. It is called reference check

		UKMedicalGuideLines uk = new ApolloHospital();
		uk.CardiologyServices();
		uk.OrthopaedicServices();
		uk.EyesServices();
		uk.RadiologyServices();

		// down casting is not possible---parent interface's object is refereerd by
		// child class reference variable
		// you can not create object of interface
		// you can declare methods only---method prototype---no method body inside
		// interface
		// you can not vreate static prototype method in inyterface
		// you cant override static method
		// interface variables are static and final by default

	}

}
