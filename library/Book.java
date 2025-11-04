package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private boolean isAvailable; 
	
	// TODO: implement Book functionality 
	
	public Book(String title) {
		this.title = title;
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
}
