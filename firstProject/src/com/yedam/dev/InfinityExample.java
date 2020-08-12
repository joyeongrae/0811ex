package com.yedam.dev;

public class InfinityExample {
	
	public static void main(String[] args) {
	  
		int x  = 5;
		double y = 0.0;
		
		double z = x % y ;
		//System.out.println(z);  // % nan / infinity
        
		if(Double.isNaN(z) ||Double.isInfinite(z))
		{
			System.out.println("의미없는 값 입니다");
		}
		else
		{
			System.out.println(z);
		}
	}

}
