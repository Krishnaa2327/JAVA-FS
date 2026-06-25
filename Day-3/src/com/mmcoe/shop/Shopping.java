package com.mmcoe.shop;

public interface Shopping {
	 void addToCart(Product p) throws CartException;

	 void checkout();
}
