package com.moneymoneybank.bank.bankabstract;

public abstract class SavingAcc extends BankAcc {

	private float creditLimit;
	
	public SavingAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	
	
	

	@Override
	public String toString() {
		return "SavingAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	
	
	
}
