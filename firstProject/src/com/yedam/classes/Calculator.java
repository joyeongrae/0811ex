package com.yedam.classes;

public class Calculator {
	
	double pi = 3.14;
	
	//가로, 세로 => 넓이를 반환해주는 메소드(getRectagle)
	
	public int getRectagle(int x, int y)
	{
		
		return x * y;
	
	}
 	public int add(int x, int y)
	{
		int sum = 0;
		sum = x+y;
		return sum;
	}
	
	public double add(double x, double y)
	{
		return x + y;
	}
	
	public void getArea(double a)
	{
		double result = pi* a*a;
		System.out.print("반지름" + a + "의 넓이는" + result);
	}
}

