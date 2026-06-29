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
	
	 public void issueTo(Member m){
	        if(mbr != null){
	          System.out.println(title + " is already issued to " + mbr);
	        }
	        if(m.getBook() != null){
	        	System.out.println(m + " already has a book issued");
	            
	        }

	        mbr = m;
	        m.setBook(this);
	        System.out.println(title + " issued to " + m);
	    }

	    public void returnBook() {
	        if(mbr == null){
	        	System.out.println(title + " is already available");
	            
	        }

	        Member temp = mbr;
	        mbr = null;
	        temp.setBook(null);
	        System.out.println(title + " returned successfully");
	    }

}
