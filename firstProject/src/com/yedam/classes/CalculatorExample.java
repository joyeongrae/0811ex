package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
	
	    int sum1 = 0;
	    double sum2 = 0;
		Calculator cal = new Calculator();
		
		sum1 = cal.add(2, 3);
		sum2 = cal.add(2.3, 1.2);
		
		System.out.println(sum1+"\n"+sum2);
		
		double r1 = 3.5;
		cal.getArea(r1); //return 없이 가능
		
		
	    System.out.println();
		
		System.out.println(cal.getRectagle(4,5)); //넓이
}
}
