package com.yedam.dev;

public class BitOperatorExample {

	public static void main(String[] args) {
		
	    int v1 = 10;
	    int v2 = ~v1;  //그냥반전하면 1의보수가 나온다 
	    System.out.println(v1);
	    System.out.println(v2+1); //그래서 여기서 2의보수로 바꿔준다
	    
	    
	    byte b1 = 10;
	    byte b2 = 4;
	    int b3 = b1 % b2 ;
	    
	    System.out.println(Integer.MIN_VALUE);
	    
	    int result=safeAdd(2147483647,10);
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int safeAdd(int a, int b)
	{
		int sum = 0 ;
		if(Integer.MAX_VALUE - b < a )
		{
			System.out.println("유호값이 아닙니다");
			sum = 0;
		}
		
	/*	else if ( ) {
			
			System.out.println("유효값이 아닙니다.");
			sum  = 0;
		}
		
		*/
		
		else {
			sum  = a + b;
		}
			return sum;
	}
}
