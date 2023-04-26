package com.seong.prgApp6.Account;

import java.io.*;
import java.util.*;

public class AccountManager {
	public static final String ObjectFile = "AccountObject.dat";

	public void transferAccountFile(String fileName) {
		try (Scanner sc = new Scanner(new File(fileName)); ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ObjectFile)))//계좌 정보 읽어오기
		{
			sc.useDelimiter(":");
			String[] accountInfo;
			while (sc.hasNext()) {
				accountInfo = sc.next().strip().split(" ");
				Account ac1 = new Account(Integer.parseInt(accountInfo[0]), Integer.parseInt(accountInfo[1]));
				objectOutputStream.writeObject(ac1);
			}
		} catch (IOException e) {
			System.out.println("저장할 파일이 없습니다.");
			e.printStackTrace();
		}
	}

	public void requestManager() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			TreeMap<Integer, Account> accountMap = new TreeMap<>();
			try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ObjectFile))) {
				Account Acc;
				while ((Acc = (Account) objectInputStream.readObject()) != null) { //객체 정보를 읽어 온다.
					accountMap.put(Acc.getAccountNum(), Acc);
				}
			} catch (EOFException e) {
				System.out.println("파일을 끝까지 읽었습니다.");
			} catch (IOException e) {
				System.out.println("파일 읽기에 실패했습니다.");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
			System.out.print("계좌번호를 입력하세요(-1 입력시 종료):");
			int acNum = sc.nextInt();
			if (acNum == -1) {
				break;
			}
			Account requestAccount = accountMap.get(acNum);
			int selection = 0;
			while (selection != 5) {
				System.out.println("실행할 기능을 선택하세요");
				System.out.println("1.잔고조회 2.입금 3.출금 4.계좌이체 5.종료");
				selection = sc.nextInt();

				switch (selection) {
					case 1 -> {
						System.out.printf("계좌번호:%d의 잔액은:%d\n", requestAccount.getAccountNum(), requestAccount.getBalance());
					}
					case 2 -> {
						System.out.printf("얼마를 입금하시겠습니까?(현재 잔액:%d):", requestAccount.getBalance());
						int cash = sc.nextInt();
						requestAccount.deposit(cash);
						System.out.printf("정상적으로 입금 되었습니다.(입금 후 잔액:%d)\n", requestAccount.getBalance());
					}
					case 3 -> {
						System.out.printf("얼마를 출금하시겠습니까?(현재 잔액:%d)", requestAccount.getBalance());
						int cash = sc.nextInt();
						System.out.printf("%d원이 출금 되었습니다(출금 후 잔액:%d)\n", requestAccount.withdraw(cash), requestAccount.getBalance());
					}
					case 4 -> {
						System.out.println("이체할 계좌 번호를 입력해주세요:");
						int AcNum = sc.nextInt();
						Account tempAccount = accountMap.get(AcNum);
						System.out.printf("현재 계좌의 현재 잔액:%d:\n", requestAccount.getBalance());
						System.out.printf("이체할 계좌의 잔액:%d:\n", tempAccount.getBalance());

						System.out.println("이체할 금액을 입력해주세요:");
						int cash = sc.nextInt();
						Account.transfer(requestAccount, tempAccount, cash);
						System.out.println("계좌이체가 성공적으로 완료 되었습니다.\n");
						System.out.printf("현재 계좌의 현재 잔액:%d:\n", requestAccount.getBalance());
						System.out.printf("이체할 계좌의 잔액:%d:\n", tempAccount.getBalance());
					}
					case 5 -> {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
				}
			}
			ArrayList<Account> acList = new ArrayList<>(accountMap.values());
			Collections.sort(acList, Account::compareTo);
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ObjectFile))){
				for(int i = 0 ; i < acList.size();i++){
					Account temp = acList.get(i);
					System.out.println(temp);
					objectOutputStream.writeObject(temp);
				}
			}catch (IOException e){

			}
		}
	}
}
