package thisandSuper;

public class CurrentObject {
	
	String name;
	
	CurrentObject(String name){
		this.name = name;
	}
	
	// to pass the name to another method
	
	public void display() {
		System.out.println("Name is : "+ this.name);
	}
	


}
