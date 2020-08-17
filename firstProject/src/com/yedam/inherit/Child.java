package com.yedam.inherit;

public class Child extends Parent{
	private int grade; 
	
	public Child(String name, int age) {
		super(name, age); //부모가 가지고 있는 생성자
		
	}
	
	public Child(String name, int age, int grade)
	{
		super(name, age);
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
