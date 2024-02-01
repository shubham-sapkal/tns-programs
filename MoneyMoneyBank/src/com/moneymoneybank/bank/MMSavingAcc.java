package com.moneymoneybank.bank;

import com.moneymoneybank.bank.bankabstract.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	
	public void withdraw(float amt)
	{
		
		if( (getAccBal()-amt) < 0 ) {
			System.out.println("Cant Withdraw, Amt is Less.");
		}
		
		System.out.println("Withdrawing From Saving Account. ");
		setAccBal( getAccBal()-amt );
		
	}
	
	public void credit(float amt)
	{
		
		
		
	}
	
}
