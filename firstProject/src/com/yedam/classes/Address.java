package com.yedam.classes;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		
		
		boolean run =true;
		int studentNum = 0;
		Scanner scn = new Scanner(System.in);
		Friend f1 =new Friend(null, null, null);
		Friend f2 =new Friend(null, null, null);
		Friend f3 =new Friend(null, null, null);
		
		
		String [] input1 = new String[3];
		String [] input2 = new String[3];
		String [] input3 = new String[3];
		
		
		
			
	while(run) {
		
		
		
		System.out.println("1. 정보입력, 2.리스트, 9.종료");
		System.out.println();
		
		int selectNum = scn.nextInt();
		scn.nextLine();
		
		if(selectNum==1) {
			System.out.println("1번입력ㅈㅈㅈㅈㅈㅈㅈㅈㅈㅈㅈㅈㅈ");
		for(int i = 0;i<input1.length;i++)
		{
			//System.out.println("이름좀 입력해랏");
			
			
			
			//System.out.println();
			if( i==0){
				System.out.println("이름입력해");
				input1[i] = scn.nextLine();
			f1.setname(input1[i]);
			}
			else if(i==1)
			{
				System.out.println("나이입력해");
				input1[i] = scn.nextLine();
			f1.setage(input1[i]);
			}
			else 
			{
				System.out.println("폰번호");
				input1[i] = scn.nextLine();
				f1.setphonenumber(input1[i]);
			}
		
			//System.out.println(f1.introduce());
		}
		
		
			
			
			
		
			for(int i = 0;i<input2.length;i++)
			{
				//System.out.println("이름좀 입력해랏");
				
				
				
				System.out.println();
				if( i==0){
					System.out.println("이름입력해");
					input2[i] = scn.nextLine();
				f2.setname(input2[i]);
				}
				else if(i==1)
				{
					System.out.println("나이입력해");
					input2[i] = scn.nextLine();
					f2.setage(input2[i]);
				}
				else 
				{
					System.out.println("폰번호");
					input2[i] = scn.nextLine();
					f2.setphonenumber(input2[i]);
				}
			
				//System.out.println(f1.introduce());
			}
			
			
			for(int i = 0;i<input3.length;i++)
			{
				//System.out.println("이름좀 입력해랏");
				
				
				
				System.out.println();
				if( i==0){
					System.out.println("이름입력해");
					input3[i] = scn.nextLine();
				f3.setname(input3[i]);
				}
				else if(i==1)
				{
					System.out.println("나이입력해");
					input3[i] = scn.nextLine();
					f3.setage(input3[i]);
				}
				else 
				{
					System.out.println("폰번호");
					input3[i] = scn.nextLine();
					f3.setphonenumber(input3[i]);
				}
			
				//System.out.println(f1.introduce());
			}
			
			System.out.println("정보입력끝");
			System.out.println("1. 정보입력, 2.리스트, 9.종료");
			selectNum = scn.nextInt();
			if(selectNum==2)
			{
				
			
			System.out.println("1번쨰 입력한놈의 정보");
			System.out.println(f1.introduce());
			System.out.println("2번쨰 입력한놈의 정보");
			System.out.println(f2.introduce());
			System.out.println("3번쨰 입력한놈의 정보");
			System.out.println(f3.introduce());
			System.out.print("9번 입력하면 종료");
			selectNum = scn.nextInt();
			if(selectNum==9)
			{
				
				run =false;
			}
			
			}
			
			
		
	}
	}
}
}