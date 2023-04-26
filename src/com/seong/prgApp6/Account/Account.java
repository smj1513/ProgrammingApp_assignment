package com.seong.prgApp6.Account;

import java.io.Serializable;

public class Account implements Comparable<Account>, Serializable {
	private int accountNum;
	private int balance;
	public Account(int AccountNum){
		this.accountNum=AccountNum;
		balance=0;
	}
	public Account(int AccountNum, int balance){
		this.accountNum=AccountNum;
		this.balance=balance;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int cash){
		balance+=cash;
	}
	public int withdraw(int cash){
		balance-=cash;
		return cash;
	}
	public static void transfer(Account fromAct, Account toAct, int cash){
		int tempCash = fromAct.withdraw(cash);
		toAct.deposit(tempCash);
	}
	@Override
	public String toString(){
		return "( 계좌번호:"+accountNum+" 잔액:"+balance+" )";
	}
	@Override
	public boolean equals(Object o){
		Account temp = (Account) o;
		return this.getAccountNum()==temp.getAccountNum();
	}
	@Override
	public int compareTo(Account o) {
		return Integer.compare(this.balance, o.balance);
	}
}
