package com.moneymoneybank;

import com.moneymoneybank.bank.bankabstract.CurrentAcc;
import com.moneymoneybank.bank.bankabstract.SavingAcc;
import com.moneymoneybank.bankfactory.MMBankFactory;

public class Main {
	public static void main(String args[])
	{
		
		MMBankFactory bankFactory = new MMBankFactory();
		
		// Creating saving acc
		SavingAcc savingAcc = bankFactory.getNewSavingAccount(101, "Shubham", 1400, 10000);
		
		// Creating Curr Acc
		CurrentAcc currentAcc = bankFactory.getNewCurrentAccount(201, "Himang", 180000, true);
		
		// Withdraw from saving
		savingAcc.withdraw(18);
		System.out.println(savingAcc.toString());
		
		// Withdraw From Current
		currentAcc.withdraw(1250);
		System.out.println(currentAcc.toString());
		
		
	}
}
