package com.mmcoe.bank;

public class TestBank {

	public static void main(String[] args) throws BalanceException {
		Accounts ac = new Accounts(5000);
		System.out.println(ac);
		
		try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
//			e.printStackTrace(); //gives trace of error for debugging
//			System.out.println(e); // audit system behaviour 
			System.out.println(e.getMessage()); // for end user
		}
	    
		ac.withdraw(3000);
		System.out.println(ac);
		ac.withdraw(7000);
		System.out.println(ac);
		
		ac.deposit(2000);
		System.out.println(ac);
		ac.deposit(8000);
		System.out.println(ac);
		
	}
}
