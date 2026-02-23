package thisandSupers01;

public class Jeep extends Vehicle{
	
	
	
	public void jeepInfo() {
		
		String name = "Truck";
		
		System.out.println("Jeep Name : "+ super.name); // name of parent class
		System.out.println("Truck Name : "+ name); // name of this class
		
		// we can access only global variables using the super keyword
	}

}
