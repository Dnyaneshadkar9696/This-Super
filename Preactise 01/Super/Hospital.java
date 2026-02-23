package thisandSupers01;

public class Hospital {
	
	// calling the method from the parent class example
	
	// this is a parent class 
	
	Hospital(){
		System.out.println("Welcome to the Pawna Hospital");
	}
	
	public void patientDetails() {
		int f  = 43;
		System.out.println("Total Patients : "+ f);
	}
	
	public void totalBeds() {
		int x = 67;
		System.out.println("Totla Beds In the Hospital  : "+ x);
	}
	

}
