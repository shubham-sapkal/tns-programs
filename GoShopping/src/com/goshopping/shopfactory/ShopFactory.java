package com.goshopping.shopfactory;

import com.goshopping.shopacc.abstractshopacc.PrimeAcc;
import com.goshopping.shopacc.abstractshopacc.ShopAcc;
import com.goshopping.shopacc.abstractshopacc.NormalAcc;


//import com.goshopping.shopacc.GSNormalAcc;
//import com.goshopping.shopacc.GSPrimeAcc;

public interface ShopFactory {

//	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);
//	
//	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
	
	
	public ShopAcc getAccount(int accNo, String accNm, float charges, float deliveryCharges, boolean isPrime);
	
}
