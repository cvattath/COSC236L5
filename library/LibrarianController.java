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

    public boolean addBook(String title,String author){
        return this.library.addBook(title,author);
    }

    public boolean borrowBook(String title, String name) {
        Member member = this.library.findMemberByName(name);
        Book book = this.library.findBookByTitle(title);

        if(book == null || member == null) return false;
        if(validateMemberBook(member, book)) {
            return member.borrow(book);
        }
        return false;
    }

    public boolean returnBook(String title, String name) {
        Member member = this.library.findMemberByName(name);
        Book book = this.library.findBookByTitle(title);

        if(book == null || member == null) return false;
        if(validateMemberBook(member, book)) {
            return member.returnBook(book);
        }
        return false;
    }

    public boolean addMember(String name) {
        return this.library.addMember(name);
    }

    private boolean validateMemberBook(Member member, Book book) {
        return library.isMemberValid(member) && library.isBookValid(book);
    }

    public void printAvailableBooks() {
        library.printAvailableBooks();
    }

    public void printMembers() {
        library.printMembers();
    }
}
