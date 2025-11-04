package lab4.library;
import java.util.ArrayList;
import java.util.List;

public class Member{

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
    private static int memberIncrement;
	private int memberId;
	
	private List<Book> borrowedBooks;
	// TODO: implement collection of borrowed books
	
	// TODO: implement functionality of Member class
	
	public Member(String name) {
		this.name = name;
		this.memberId = memberIncrement++;
		borrowedBooks = new ArrayList<>();
	}

    public String getName(){
        return this.name;
    }
	
	public boolean borrow(Book book) {
		if(!borrowedBooks.contains(book) && book.borrow()) {
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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return this.memberId == member.memberId && this.name.equals(member.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.memberId;
    }
}
