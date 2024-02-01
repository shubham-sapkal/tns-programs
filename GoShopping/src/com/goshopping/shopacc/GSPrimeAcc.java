package com.goshopping.shopacc;

import com.goshopping.shopacc.abstractshopacc.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	private final float Charges;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges, isPrime);
		this.Charges = 0;
	}

	@Override
	public void items(float a) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public String toString() {
//		return "GSPrimeAcc [Charges=" + Charges + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
//				+ ", getCharges()=" + getCharges() + "]";
//	}
	
	
	
}
