package lab4.library;
//Simplified verion of Library Management System

import java.util.ArrayList;
import java.util.HashMap;


public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        LibrarianController controller = new LibrarianController(library);

        System.out.println(" *** Library management system demo *** ");

        // Adding some books to the catalog
        System.out.println("\n *** Adding \"Dune\" to the library:");
        controller.addBook("Dune");

        System.out.println("\n *** Adding \"1984\" to the library:");
        controller.addBook("1984");

        System.out.println("\n *** Adding \"Moby Dick\" to the library:");
        controller.addBook("Moby Dick");

        // Show available books
        System.out.println("\n *** Show all books:");
        library.printAvailableBooks();

        // Adding members
        System.out.println("\n *** Adding \"Alice\" to the library members");
        controller.addMember("Alice");

        System.out.println("\n *** Adding \"Bob\" to the library members");
        controller.addMember("Bob");

        // Show members
        System.out.println("\n *** Show all members");
        library.printMembers();

        // Borrow a book
        System.out.println("\n *** Alice borrows Dune:");
        controller.borrowBook("Dune", "Alice");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        library.printAvailableBooks();

        System.out.println("\n *** Bob borrows 1984:");
        controller.borrowBook("1984", "Bob");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        library.printAvailableBooks();

        System.out.println("\nBob borrows Dune:");
        controller.borrowBook("Dune", "Bob");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        library.printAvailableBooks();

        // Return a book
        System.out.println("\n *** Alice returns Dune:");
        controller.returnBook("Dune", "Alice");

        // Show available books after returning
        System.out.println("\n *** Show all books:");
        library.printAvailableBooks();

        System.out.println("\n *** Bob borrows Dune:") ;
        controller.borrowBook("Dune", "Bob");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        library.printAvailableBooks();

    }
}