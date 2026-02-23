package thisandSuper;

public class Student {
	
	private String name;
	private int id;
	private long mobNumber;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public long getMobNumber() {
		return mobNumber;
	}
	

	
	Student(String name , int id, long mobNumber){
		this.name = name;
		this.id = id;
		this.mobNumber = mobNumber;
		System.out.println("Student information: ");
		System.out.println("Name : "+ this.getName());
		System.out.println("Id : "+ this.getId());
		System.out.println("Mobile Number : "+ this.getMobNumber());
	}

}
