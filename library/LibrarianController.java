package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
    private Library library;

    public LibrarianController(Library library) {
        this.library = library;
    }

    public boolean addBook(Book book){
        return this.library.addBook(book);
    }

    public boolean borrowBook(Member member, Book book) {
        return member.borrow(book);
    }

    public boolean returnBook(Member member, Book book) {
        return member.returnBook(book);
    }

    public Member addMember(String name, int memberID) {
        return this.library.addMember(name, memberID);
    }
}