package com.yedam.dev;

public class OperatorExample {

	public static void main(String[] args) {
		int a = 10;
		int result = 3 + (8 - 5) * 4 + a++;
		System.out.println(result);
        
		result = 10 % 7;
		System.out.println(result);
		
		result = 10 / 7;
		System.out.println(result);
		
		double r1 = 10 / 7;
		System.out.println(r1);
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i);
			if(i%2==0)
			{
				System.out.println(" 은 짝수입니다");
			}
			else
			{
				System.out.println(" 은 홀수입니다");
			}
			
			
		}
		
	}
}
