package com.moneymoneybank.bank;

import com.moneymoneybank.bank.bankabstract.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	
	public void withdraw(float amt)
	{
		
		
		if( (getAccBal()-amt) < 0 ) {
			System.out.println("Cant Withdraw, Amt is Less.");
		}
		
		System.out.println("Withdrawing From Current Account. ");
		setAccBal( getAccBal()-amt );
		
		
	}

	
	
}
