package thisandSuper;

public class ConstructorCall {
	
	
	int num;
	
	public int getNum() {
		
		// in get we just return the value to the user
		return num;
		
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public ConstructorCall() {
		
		
		System.out.println("Calliing one constructor with the help of this keyword to another constructor");
	}
	
	public ConstructorCall(int number ) {
		
		boolean t = true;
		
		for(int i = 2; i < number ; i++) {
			if(number%i == 0) {
				t = false;
				break;
			}
		}
		
		if(t == true) {
			System.out.println("Number is a prime number");
		}
		else {
			System.out.println("Number is not a prime number");
		}
	}
	
	public ConstructorCall(int b , int c, int num) {
		
		this(num);
		
		// the number this is taken but suppose we want the number from the uer then do getter and setter;
		// just we have to pass the parameters so it can detect the constuctor
		System.out.println("Addition of two numbers is : "+ ( b + c));
	}

	
	
	

}
