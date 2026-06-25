import com.mmcoe.shop.*;

public class TestCart {

	public static void main(String[] args) {
		ShoppingCart Cart = new ShoppingCart();
		
		Product p1 = new Product("Book", 110);
		Product p2 = new Product("Pen", 10);
		Product p3 = new Product("Laptop", 50000);

		Cart.addToCart(p1);
		Cart.addToCart(p1);
		Cart.addToCart(p2);
		Cart.addToCart(p2);
		Cart.addToCart(p3);
		
		Cart.addToCart(p3);
		
		Cart.checkout();
		
		
	}
}
