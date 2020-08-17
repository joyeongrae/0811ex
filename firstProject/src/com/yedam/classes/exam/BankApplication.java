package com.yedam.classes.exam;
import java.util.Scanner;


public class BankApplication {

	private static BankAccount[] accountArray = new BankAccount[100];
	private static  Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		boolean run = true;
	
	while(run)
	{
		System.out.print("===========================");
		System.out.print("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
		System.out.print("===========================");
		System.out.print("선택>");
		
		int selectNo = scn.nextInt();
		scn.nextLine();
		
		if(selectNo == 1)
		{
			System.out.println("계좌생성");
			createAccount();			
		}else if (selectNo == 2)
		{
			accountList();
		}
		else if (selectNo == 3)
		{
			deposit();
		}
		else if (selectNo == 4)
		{
			withdraw();
		}
		else if (selectNo == 5)
		{
			run = false;
		}
		
	}
		System.out.println("프로그램 종료");
	}
	//계좌 생성하기
	private static void createAccount() {
		
	            System.out.println("계좌번호");
	            String acnum = scn.nextLine();	            
	         //   accountArray[i].setAno(acnum);
	            
	            System.out.println("계좌주");
	            String acname = scn.nextLine();
	          //  accountArray[i].setOwner(acname);
	            
	            System.out.println("초기입금액");
	            int acinput = scn.nextInt();
	         //   accountArray[i].setBalance(acinput);
	            
	            BankAccount f = new BankAccount(acnum,acname,acinput);
	           
	            for(int i = 0;i<accountArray.length;i++)
	            {
	            	
	            	if(accountArray[i]==null)
	            	{
	            		accountArray[i]=f;
	            		break;
	            	}
	            	
	            	
	            	
	            }
	            
	            
	            System.out.println("계좌가 생성되었습니다");
	           
		   }
		  
	
	//계좌 목록보기
	private static void accountList() {
		
		for(int i =0;i<accountArray.length;i++) 
		{
			if(accountArray[i] != null)
        	{
		System.out.println("목록 " +accountArray[i].introduce());
		}
		}
		
	}
	//예금하기
	private static void deposit() {
		System.out.println("계좌번호: ");
		String ano = scn.nextLine();
		System.out.println("입금액: ");
		int balance = scn.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				int curBalance = accountArray[i].getBalance();
				accountArray[i].setBalance(curBalance + balance);
			}
		}
	}

	private static void withdraw() {
		System.out.println("계좌번호: ");
		String ano = scn.nextLine();
		System.out.println("출금액: ");
		int balance = scn.nextInt();
		Account acnt = findAccount(ano);
		int curBalance = acnt.getBalance(); // 현재잔액
		acnt.setBalance(curBalance - balance); // 잔고
	}

	private static Account findAccount(String ano) {
		Account searchAcnt = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				searchAcnt = accountArray[i]; // Account[]
			}
		}
		return searchAcnt;
	}
}