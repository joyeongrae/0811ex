package com.yedam.exam;
import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0; //예금
		int wksrh=0; //잔고
		int output =0; //출금
		
		Scanner scanner = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("---------------------");
			System.out.println("1.예금, 2.출금, 3.잔고, 4.종료");
			System.out.println("---------------------");
			System.out.print("선택 > ");
			int menu = scanner.nextInt(); //enter 누를 때까지 입력 기다림
			if(menu==1)
			{
				System.out.println("예금액 입력하세요");
				balance =scanner.nextInt();
				System.out.println("예금액은" +balance+ " 입니다");
			}
			else if(menu==2)
			{
				System.out.println("출금액 입력하세요");
				output =scanner.nextInt();
				System.out.println("출금" +output+ " 입니다");
			}
			else if(menu==3)
			{
				System.out.println("잔고 입력하세요");
				wksrh = balance - output;
				System.out.println("잔고" +wksrh+ " 입니다");
			}
			else if(menu==4)
			{
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
