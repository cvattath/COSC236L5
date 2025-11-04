package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	private List<Book> memberBook;
	private List<Member> memberList;

	public Library(List<Book> memberBook, List<Member> memberList){
		this.memberBook = memberBook;
		this.memberList = memberList;
	}
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	private void printCatalog(){
		System.out.println("List of Books: ");
		for(Book book : memberBook){
			System.out.println(book);
		}
	}

	private void printMembers(){
		System.out.println("List of Members: ");
		for(Member member : memberList){
			System.out.println(member);
		}
	}

	// TODO: implement functionality of Member class

}
