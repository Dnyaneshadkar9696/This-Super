package thisandSuper;
import java.util.Scanner;
public class Controll {
	
	static Scanner scc = new Scanner(System.in);

	public static void main(String args[]) {
		
		// here we do the calling functionalities
		
		Car a = new Car(50);
		a.carset(500);
	
		System.out.println("The cc for global variable is : " + a.carget());
		
		// we use the get value to print the value
		System.out.println();
		Book b = new Book(); 
		b.bookNameset("Atomic Habbits");
		b.bookWriterset("Neal Miles");
		b.bookCostset(499);
		b.bookCost();
		
		// here no need to call the method seperately when the object is created
		// just put the this.methodname in the last method and call the last method 
		
		System.out.println();
		CurrentObject d = new CurrentObject("Swaraj");
		d.display();
		
		// Constructor chaining
		System.out.println();
		ConstructorCall cs = new ConstructorCall();
		// have to create the separate object if we have to use scanner and accurate sequece like using this keyword
		System.out.println("Enter the number to check the number is prime or not ");
		int num = scc.nextInt();
		
		ConstructorCall cc = new ConstructorCall(4, 4,num);
		
		
	}

}
