// Day-2 Assignment

package com.mmcoe.library;

public class TestLibrary {
	
	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		
		Member m1 = new Member("Krishna");
		Member m2 = new Member("George");
		
		b1.status();
		m1.status();
		
	    System.out.println("Issue Book");
	    b1.issueTo(m1);

	    b1.status();
	    m1.status();

	    System.out.println("Trying to Issue Same Book Again");
	    b1.issueTo(m2);

	    System.out.println("Return Book");
		b1.returnBook();

	    b1.status();
	    m1.status();

		b1.issueTo(m2);

	    b1.status();
	    m2.status();
	}
}
