package com.goshopping.shopacc;

import com.goshopping.shopacc.abstractshopacc.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	private final float Charges;
	
	public GSNormalAcc(int accNo, String accNm, float charges, float delivaryCharges)
	{
		super(accNo, accNm, charges+delivaryCharges);
		this.Charges = charges + delivaryCharges;
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
