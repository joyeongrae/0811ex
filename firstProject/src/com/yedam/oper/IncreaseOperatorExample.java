package com.yedam.oper;

public class IncreaseOperatorExample {

	public static void main(String[] args) {
		
	/*	boolean run = false;
		int var1 = 0;
		 
		var1++;//var1=var1+1;   
	    for(int i = 0; i < 3; i++)
	    {
	    	run = !run;
	    	
	    	if(run)
	    	{
	    		var1++; // 1:ok, 3:ok
	    		System.out.println(var1);
	    	}
	    }
	  */
		
	String str1 = " Hello";
	String str2 = " world";
	String name = " 이창호";
	System.out.println(str1 + " ," + name);
	
	int a=150, b = 270;
	int result = add(a,b);
	
	System.out.println("결과값:" + result);
	
	result = minus(4,2);
	System.out.println(result);
	
	
	
	
	
	
	//introduce("홍길동");
	}
	
	/* public static void introduce()
	{
		System.out.println("안녕하세요. " + name + "입니다");
	}
	*/
	public static int add (int x, int y ) //method
	
	
	{
		int sum = x + y;
		return sum;
	}
	
public static int minus (int x, int y ) 
	
	
	{
		int sum = x - y;
		return sum;
	}
	
	
}
