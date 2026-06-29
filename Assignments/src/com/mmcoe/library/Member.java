package com.mmcoe.library;

public class Member {
	private String name;
	private Book bk;
	
	
	
	public Member(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}


	public void status() {
		if(bk == null) 
			System.out.println(name + " has not issued any book");
		else
			System.out.println(name + " has issue " + bk);
	}
	
	 public Book getBook(){
	        return bk;
	}

	 public void setBook(Book bk){
	        this.bk = bk;
	 }

}
