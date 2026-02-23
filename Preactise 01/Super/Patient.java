package thisandSupers01;

public class Patient extends Hospital {
	
	Patient(){
//		super();
		// when we dont call the constructor of parent class it gets executed automatically first
		
		super.patientDetails();
		super.totalBeds();
	}
	
	

}
