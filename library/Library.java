package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	private List<Book> books;
	private List<Member> members;

	public Library(){
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
	}
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	private void printCatalog(){
		System.out.println("List of Books: ");
		for(Book book : books){
			System.out.println(book);
		}
	}

	private void printMembers(){
		System.out.println("List of Members: ");
		for(Member member : members){
			System.out.println(member);
		}
	}

    public boolean addBook(Book book){
        if(!books.contains(book)){
            books.add(book);
            return true;
        }
        return false;
    }

	// TODO: implement functionality of Member class

    public Member addMember(String name, int memberID){
        Member newMember = new Member(name, memberID);
        members.add(newMember);
        return newMember;
    }
}
