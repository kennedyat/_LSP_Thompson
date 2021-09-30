package org.howard.edu.lsp.assignment2;
import java.util.*;

public class Library {
	
	String address;
	Vector<Book> storeBooks= new Vector<Book>(4);// Add the missing implementation (methods and data definitions) to this class 
	void addBook(Book book) {
		storeBooks.add(book) ;
	}
	void printOpeningHours(){
		System.out.println("Libraries are open daily from 9am to 5pm. ");
	}
	
	void borrowBook(String title){
		for(Book book : storeBooks) {
			if (book.getTitle().equals(title)) {
				if(book.isBorrowed()==false) {
					System.out.println("You successfully borrowed"+book.getTitle());
					book.borrowed();
					return;
				}
				System.out.println("Sorry, this book is already borrowed.");
				return;
			}
			
		}
		System.out.println("Sorry, this book is not in our catalog. ");
	}
	
	void printAvailableBooks() {
		for(Book book : storeBooks) {
			if(!book.isBorrowed())
				System.out.println(book.getTitle());
		}
		if(storeBooks.size()==0)	System.out.println("No book in catalog ");
	}
	void returnBook(String title) {
		for(Book book : storeBooks) {
			if (book.getTitle().equals(title)) {
				book.returned();
				System.out.println("You successfully returned The Lord of the Rings ");
			}
		}
	}
	

	// Constructor – look it up
	public Library(String address) {
		this.address = address;
		// Implement the constructor
	}
	void printAddress(){
		System.out.println(address);
	}

	public static void main(String[] args) { 
	// Create two libraries 
	Library firstLibrary = new Library("10 Main St."); 
	Library secondLibrary = new Library("228 Liberty St."); 

	// Add four books to the first library 
	firstLibrary.addBook(new Book("The Da Vinci Code")); firstLibrary.addBook(new Book("Le Petit Prince")); 
	firstLibrary.addBook(new Book("A Tale of Two Cities")); firstLibrary.addBook(new Book("The Lord of the Rings")); 

	// Print opening hours and the addresses 
	System.out.println("Library hours:");
	firstLibrary.printOpeningHours(); 
	System.out.println(); 
	System.out.println("Library addresses:"); 
	firstLibrary.printAddress(); 
	System.out.println("Library hours:");
	secondLibrary.printOpeningHours(); 
	System.out.println(); 
	System.out.println("Library addresses:"); 
	secondLibrary.printAddress(); 

	// Try to borrow The Lords of the Rings from both libraries System.out.println("Borrowing The Lord of the Rings:"); firstLibrary.borrowBook("The Lord of the Rings"); 
	firstLibrary.borrowBook("The Lord of the Rings"); secondLibrary.borrowBook("The Lord of the Rings"); 
	System.out.println(); 

	System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); 
	System.out.println(); 
	System.out.println("Books available in the second library:"); secondLibrary.printAvailableBooks(); 
	System.out.println(); 

	// Return The Lords of the Rings to the first library 
	System.out.println("Returning The Lord of the Rings:"); firstLibrary.returnBook("The Lord of the Rings"); 
	System.out.println(); 

	System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); 
	
	   	 } 

}
