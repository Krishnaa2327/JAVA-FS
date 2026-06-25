
public class ShoppingCart {
	private Product[] items;
	private double total;
	private int count;
	
	public ShoppingCart() {
		items = new Product[5];
	}
	
	public void addToCart(Product P) {
		if(count == items.length)
			System.out.println("Cart is full");
		else {
			items[count] = P;
	    	total += P.getPrice();
	    	count++;

	    System.out.println(P + " added to cart");
	}
	}
    public void checkout() {
        System.out.println("Items in Cart:");
        for(int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }

        System.out.println("Total Amount = " + total);
    }
}
