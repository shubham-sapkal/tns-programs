package com.goshopping.shopacc.abstractshopacc;

public abstract class PrimeAcc extends ShopAcc {
	
	private boolean isPrime;
	private static final float deliveryCharges = 0;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public void bookProduct(float charges) {
		System.out.println("Charges Are: " + deliveryCharges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + "]";
	}
	
}
