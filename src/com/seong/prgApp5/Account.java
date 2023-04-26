package com.seong.prgApp5;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account(){
		id=0;
		balance=0.0;
		annualInterestRate=0.0;
		dateCreated= new Date();
	}
	Account(int id, double balance){
		this.id=id;
		this.balance=balance;
		annualInterestRate=0.0;
		dateCreated= new Date();
	}

	public int getId(){
		return this.id;
	}
	public double getBalance(){
		return this.balance;
	}
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	public Date getDateCreated(){ //엑세서
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12.0;
	}
	public double getMonthlyInterest(){
		return getMonthlyInterestRate()*balance;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate/100;
	}
	public double withdraw(double balance){ //인출
		this.balance-=balance;
		return balance;
	}
	public boolean deposit(double balance){ //입금
		this.balance+=balance;
		return true;
	}


}
