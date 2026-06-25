package com.mmcoe.shop;

public class TestCart {

	public static void main(String[] args) {
//		ShoppingCart cart = new ShoppingCart();
		Shopping cart = CartFactory.newCart();
		
		Product p1 = new Product("Book", 110);
		Product p2 = new Product("Pen", 10);
		Product p3 = new Product("Laptop", 50000);

		try {
			cart.addToCart(p1);
			cart.addToCart(p1);
			cart.addToCart(p2);
			cart.addToCart(p2);
			cart.addToCart(p3);
			
			cart.addToCart(p3);
		} catch (CartException e) {
			e.printStackTrace();
		}
		
		cart.checkout();
		
		
	}
}
