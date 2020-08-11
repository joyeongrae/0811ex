package com.yedam.dev;

public class BooleanExample {
	public static void main(String[] args) {
		
		long l1 = 10L;
		int i1 = 10;
		
		boolean trueOrFalse = false;
		trueOrFalse = l1 == i1;   //      l1 != i1 
		
		if (trueOrFalse) { // !trueOrFalse                          
			
			System.out.println("이 내용은 참일 경우에 출력됩니다.");
		
		}
		
		// >, <, >=, <=
		
		if(l1>i1)
		{
			System.out.println("l1가 크거나 같습니다.");
			
		}
		/*
		 else  
		{
			System.out.println("ㅇㅇ");
		}
		*/
		
		System.out.println(trueOrFalse);
		
		
		
	}

}
