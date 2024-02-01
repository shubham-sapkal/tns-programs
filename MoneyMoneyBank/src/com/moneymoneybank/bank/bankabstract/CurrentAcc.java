package com.moneymoneybank.bank.bankabstract;

public abstract class CurrentAcc extends BankAcc{

	private boolean isSalaried;

	public CurrentAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "CurrentAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	
	
}
