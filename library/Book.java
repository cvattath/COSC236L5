package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private string author;
	private boolean isAvailable; 
	
	// TODO: implement Book functionality 
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public boolean borrow() {
		if(isAvailable) {
			isAvailable = false;
			return true;
		}
		return false;
	}
	
    public boolean returnBook() {
        if(!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book) {
            Book book = (Book)obj;
            return this.title.equals(book.getTitle());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
