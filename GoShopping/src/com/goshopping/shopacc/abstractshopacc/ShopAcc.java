package com.goshopping.shopacc.abstractshopacc;

public abstract class ShopAcc {
	
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges)
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public float getCharges() {
		return charges;
	}


	public void setCharges(float charges) {
		this.charges = charges;
	}


	abstract public void bookProduct(float a);
	abstract public void items(float a);
	

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
}
