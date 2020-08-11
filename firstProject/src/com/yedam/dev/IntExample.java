package com.yedam.dev;

import java.math.BigDecimal;
import java.text.NumberFormat;
public class IntExample {
public static void main(String[] args) {
	
	/* int var1 = 10; // 십진수 10
	int var2 = 012; // 8진수 12 = > 10
	int var3 = 0xA; //16진수 = > 10
	
	System.out.println(var1 + " "+  var2+" " +var3);
	
	byte b1 =10;
	int result = (byte) (b1 + 10);   // (byte)를 안넣으면 자동으로 integer로 변환, data type 변환 조심
	
	System.out.println(result);
	
	// 1~10 더하기 	
	int sum=0;
	
	for(int i =1; i<11; i++)
	{
		sum=sum+i;		
	}
	System.out.println(sum);
	
	*/
	
	
	
	
	/*
	// long * long = > int 
	long l1 = 10;
	System.out.println("long 최대값: " + Long.MAX_VALUE);
	System.out.println("long 최소값: " + Long.MIN_VALUE);
	
	long l2 = 20;
	//int result = l1*l2;  long(8byte) > int(4byte) 라서 data type 맞게

	int result = (int)(l1*l2);
	System.out.println(result);
	
	
	double a = 3.14;
	int b = 3;
	
	double summ = a +b ;
	
	System.out.println(summ);
	*/
	
	
	
	
	
	System.out.println(Integer.MAX_VALUE);
	long l1 = 2147483648L;
	float f1 = 0.1234567890123456789F;
	double d1 = 0.123456789123456789;
	double d2 = 0.123456789123456789;
	double d3 = d1 + d2;
	
	System.out.println("d3 = " + d3); 
	
	BigDecimal bd1 = new BigDecimal("0.1234567890123456789");
	BigDecimal bd2 = new BigDecimal("0.1234567890123456789");
	BigDecimal bd3 = bd1.add(bd2);
	System.out.println("bd3 = " + bd3);
	
	
	
	
}
}

















