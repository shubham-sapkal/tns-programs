package com.goshopping.shopacc.abstractshopacc;

public abstract class NormalAcc extends ShopAcc {

	private final float deliveryCharge;
	
	public NormalAcc(int accNo, String accNm, float charges)
	{
		super(accNo, accNm, charges);
		
		this.deliveryCharge = charges;
	}
	
	public void bookProduct(float charges) {
		
		System.out.println("Charges Are: " + deliveryCharge);
		//this.deliveryCharge = charges;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + "]";
	}

}
