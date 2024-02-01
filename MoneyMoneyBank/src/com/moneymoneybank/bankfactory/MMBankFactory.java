package com.moneymoneybank.bankfactory;

import com.moneymoneybank.bank.MMCurrentAcc;
import com.moneymoneybank.bank.MMSavingAcc;
import com.moneymoneybank.bank.bankabstract.CurrentAcc;
import com.moneymoneybank.bank.bankabstract.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, float creditLimit) {
		return new MMSavingAcc(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		return new MMCurrentAcc(accNo, accNm, accBal, isSalaried);
	}

}
