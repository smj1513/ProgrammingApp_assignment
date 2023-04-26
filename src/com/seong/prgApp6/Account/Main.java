package com.seong.prgApp6.Account;

public class Main {
	public static void main(String[] args){
		AccountManager accountManager = new AccountManager();
		accountManager.transferAccountFile(args[0]);
		accountManager.requestManager();
	}
}
