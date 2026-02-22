package thisandSuper;

public class Book {
	
	// create a method that calls the anoter method in the same class
	String bookName;
	String bookWriter;
	int bookCost;
	
	public String bookNameget() {
		return bookName;
	}
	public String bookWriterget() {
		return bookWriter;
	}
	public int bookCostget() {
		return bookCost;
	}
	public void bookNameset(String bookName) {
		this.bookName = bookName;
	}
	public void bookWriterset(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public void bookCostset(int bookCost) {
		this.bookCost = bookCost;
	}
	
	
	
	
	
	
	
	
	
	public void bookName() {
		// we will get the values from the user.
		System.out.println("Book Name : "+ this.bookName);
		System.out.println("Book Writer : "+ this.bookWriter);
	}
	
	public void bookCost() {
		this.bookName();
		System.out.println("Book Cost : "+ this.bookCost);
	}
	
	

}
