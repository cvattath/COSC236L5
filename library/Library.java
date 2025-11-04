package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    //  GRASP Principles: Creator, Controller
    //	Manage the catalog of books and members.
    //	Track which books are borrowed and available

    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Attributes:
    // private catalog (list of Book)
    // private members (list of Members)

    public void printAvailableBooks() {
        System.out.println("List of Available Books: ");
        for (Book book : books) {
            if(book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void printMembers() {
        System.out.println("List of Members: ");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public Member findMemberByName(String name) {
        for (Member member : members) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean addBook(String title) {
        Book book = new Book(title);

        if (!books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }

    // TODO: implement functionality of Member class

    public boolean addMember(String name) {
        Member newMember = new Member(name);
        if (!members.contains(newMember)) {
            members.add(newMember);
            return true;
        }
        return false;
    }

    public boolean isMemberValid(Member member) {
        return members.contains(member);
    }

    public boolean isBookValid(Book book) {
        return books.contains(book);
    }
}
