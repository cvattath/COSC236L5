package lab4.library;
import java.util.ArrayList;
import java.util.List;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberId;
	
	private List<Book> borrowedBooks;
	// TODO: implement collection of borrowed books
	
	// TODO: implement functionality of Member class
	
	public Member(String name, int memberId) {
		this.name = name;
		this.memberId = memberId;
		borrowedBooks = new ArrayList<>();
	}
	
	public boolean borrow(Book book) {
		if(book.borrow()) {
			borrowedBooks.add(book);
            return true;
		}
		return false;
	}

    public boolean returnBook(Book book) {
        if(borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            return true;
        }
        return false;
    }
}
