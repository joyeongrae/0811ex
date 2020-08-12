package com.yedam.test;

public class test3 {
	public static void main(String[] args) {
		
		
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
	
	
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println("한명당 "+pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println("남은연필 수 "+pencilsLeft);
	
		
		
		int value = 356;
		System.out.println((value/100)*100);
		
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom)*7*0.5;
		System.out.println("넓이는" + area);
		
		
		
		int x = 10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3 == 2) || (y%2 != 1));
		
		
		
		
		
		
	}

}
