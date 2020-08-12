package com.yedam.dev;

public class StringEqualExample {
public static void main(String[] args) {
	
	
	int v1 = 20;
	int v2 = 30;
	if(v1 == v2)
	{
		System.out.println("기본타입");
	}
	
	
	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = new String("Hello"); // str3은 주솟값이 다름 
	
	if(str1 == str2)
	{
		System.out.println("1이랑 2는 같은 문자입니다");
	}
	if(str1 == str3)  //문자열 비교하려면 str1.equals(str3)라는 라이브러리 함수사용
	{
		System.out.println("1이랑 3은 같은 문자입니다");
	}
	
	System.out.println((1 == 1) && ( 2 == 2)); //true
}
}

