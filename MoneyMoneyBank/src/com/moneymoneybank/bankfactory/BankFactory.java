package com.moneymoneybank.bankfactory;

import com.moneymoneybank.bank.bankabstract.CurrentAcc;
import com.moneymoneybank.bank.bankabstract.SavingAcc;

public interface BankFactory {

	SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, float creditLimit);
	CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, boolean isSalaried);
	
}
