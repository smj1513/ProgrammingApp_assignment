package com.seong.prgApp5;

public class AccountTest {
	public static void main(String[] args){
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		double withdraw = account.withdraw(2500);
		System.out.printf("Withdraw $%.1f from your account\n", withdraw);
		if(account.deposit(3000)){
			System.out.println("Deposit is success. 3000$ has been deposited to your account.");
		}
		System.out.println();
		System.out.println("---Your Account Information---");
		System.out.println("ID:"+account.getId());
		System.out.println("Balance:$"+account.getBalance());
		System.out.println("Monthly Interest: $"+account.getMonthlyInterest());
		System.out.println("Date Created : "+account.getDateCreated());
	}
}
