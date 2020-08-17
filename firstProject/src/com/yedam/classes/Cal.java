package com.yedam.classes;

public class Cal {

	private int r; //반지름
	private double pi = 3.14; //private 메소드로만 접근가능 // static는 해당class가 로딩될때,메인함수에 클래스 존재를 알려줌
	
	
	
	public void setRadius(int r)
	{
		if(r<0) {
			r=0;
		}
		else 
			this.r = r;
	}
	
	public int getRadius() {
		return r;
	}
	public double getArea()
	
	{
		
		double result = pi * r *r;
		return result;
	}
}
