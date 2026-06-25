package com.mmcoe.library;

public class TestLibrary {
	
	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		Book b2 = new Book("Kite Runner");
		
		Member m1 = new Member("Krishna");
		Member m2 = new Member("George");
		
		b1.status();
		m1.status();
		
	    System.out.println("Issue Book");
	    try {
			b1.issueTo(m1);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    b1.status();
	    m1.status();

	    System.out.println("Trying to Issue Same Book Again");
	    try {
			b1.issueTo(m2);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    System.out.println("Return Book");
	    try {
			b1.returnBook();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    b1.status();
	    m1.status();

	    try {
			b1.issueTo(m2);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    b1.status();
	    m2.status();
	}
}
