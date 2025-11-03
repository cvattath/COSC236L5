package lab4.library;

imprt java.util.ArrayList;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	private List<Book> memberBook;
	private List<Member> memberList;

	public Library(memberBook, memberList){
		this.memberBook = memberBook;
		this.memberList = memberList;
	}
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	private void catalog(){
		System.out.println("List of Books: ");
		for(String book : memberBook){
			System.out.println(book);
		}
	}

	private void members(){
		System.our.println("List of Members: ");
		for(String individualMember : memberList){
			System.out.println(individualMember);
		}
	}

	// TODO: implement functionality of Member class

}
