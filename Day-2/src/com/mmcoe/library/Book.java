package com.mmcoe.library;

public class Book {
	private String title;
	private Member mbr;
		
	public Book(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [Title = " + title + "]";
	}

	public void status() {
		if(mbr == null) 
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + mbr);
	}
	
	 public void issueTo(Member m) throws LibraryException{
	        if(mbr != null){
	            throw new LibraryException(title + " is already issued to " + mbr);
	        }
	        if(m.getBook() != null){
	            throw new LibraryException(m + " already has a book issued");
	            
	        }

	        mbr = m;
	        m.setBook(this);
	        System.out.println(title + " issued to " + m);
	    }

	    public void returnBook() throws LibraryException{
	        if(mbr == null){
	            throw new LibraryException(title + " is already available");
	            
	        }

	        Member temp = mbr;
	        mbr = null;
	        temp.setBook(null);
	        System.out.println(title + " returned successfully");
	    }

}
