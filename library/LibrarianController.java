package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class

    public boolean borrowBook(Member member, Book book) {
        return member.borrow(book);
    }

    public boolean returnBook(Member member, Book book) {
        return member.returnBook(book);
    }
}