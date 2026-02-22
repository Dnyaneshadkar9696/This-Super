package thisandSuper;

public class Car {

	// program were the constructor parameter and the global variable have the same
	// name
	int carCC;

	Car(int carCC) {

		System.out.println("The car CC is : " + carCC);

	}
	
	public int carget() {
		
		return carCC;
		
	}
	public void carset(int carCC) {
		this.carCC = carCC;
	}
	

}
