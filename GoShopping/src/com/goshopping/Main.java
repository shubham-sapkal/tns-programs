package com.goshopping;

import com.goshopping.shopacc.abstractshopacc.ShopAcc;
import com.goshopping.shopfactory.GSShopFactory;

public class Main {
	public static void main(String args[])
	{
		GSShopFactory factory = new GSShopFactory();
		
		// Prime Account
		ShopAcc primeAcc = factory.getAccount(101, "Shubham", 191.1f, 25.5f, true);
		
		// Delivery charges
		primeAcc.bookProduct(25.5f);
		
		System.out.println(primeAcc.toString());
		
		// Normal Account
		ShopAcc normalAcc = factory.getAccount(255, "Himang", 299.0f, 25.5f, false);
		
		normalAcc.bookProduct(25.5f);
		
		System.out.println(normalAcc.toString());
	}
}
