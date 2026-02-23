package thisandSupers01;

public class Cat extends Animal {
	
	// with out creating an object we can call the members of the parent class
	
	Cat(){
		super();
		this.sleeping();
		
		//I just call it in the constructor just using the this keyword we can access the properties of the same class
		// and using the super keyword we can access the properties of the parent class.
	}
	public void sleeping() {
		super.carnivorus();
		System.out.println("Cat is a carnivorus animal");
		System.out.println("The cat of Mr.Wick is sleeping now");
	}
	
	

}
