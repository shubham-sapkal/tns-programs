package com.goshopping.shopfactory;

import com.goshopping.shopacc.GSNormalAcc;
import com.goshopping.shopacc.GSPrimeAcc;
import com.goshopping.shopacc.abstractshopacc.ShopAcc;

public class GSShopFactory implements ShopFactory {
	
//	@Override
//	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
//		return new GSPrimeAcc(accNo, accNm, charges, isPrime);
//	}
//
//	@Override
//	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
//		return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
//	}

	@Override
	public ShopAcc getAccount(int accNo, String accNm, float charges, float deliveryCharges, boolean isPrime) {
	
		if(isPrime)
		{
			return new GSPrimeAcc(accNo, accNm, charges, isPrime);
		}
		else {
			return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		}
		
		
	}

}

	
