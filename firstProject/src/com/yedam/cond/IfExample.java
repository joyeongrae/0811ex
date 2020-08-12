package com.yedam.cond;

public class IfExample {
	
	public static void main(String[] args) {
		int score = 30;
		String grade = ""; //NULL
		
		if(score >= 90)
		{
			if(score >=95)
			{
				grade = "A+";
			}else
			{
			grade = "A";
		}
		}
		else if (score >=80)
		{
			if(score >=85)
			{
				grade = "B+";
			}else
			{
			grade = "B";
		}
		}
		else if (score >= 70)
		{
			if(score >=75)
			{
				grade = "C+";
			}else
			{
			grade = "C";
		}
		}
		else
		{
			if(score >=60)
			{
				grade = "D";
			}else
			{
			grade = "F";
		}
		}
		System.out.println("제 점수는 " + grade + "입니다");
	}

}
