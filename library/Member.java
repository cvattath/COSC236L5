package lab4.library;
import.java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberId;
	
	private List<Book> borrowedBooks;
	TODO: implement collection of borrowed books
	
	// TODO: implement functionality of Member class
	
	public Member(String name, int memeberId) {
		this.name = name;
		this.memberId = memberId;
		borrowedBooks = new ArrayList<>();
	}
	
	public boolean borrowBook(Book book) {
		if(book.isAvailable()) {
			book.setAvailable(false);
		}
			borrowedBooks.add(book);
			return true;
		}
	}

}
