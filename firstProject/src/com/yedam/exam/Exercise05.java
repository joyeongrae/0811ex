package com.yedam.exam;

public class Exercise05 {
public static void main(String[] args) {
	

	int x=4;
	int y=5;
    int result = 60;
	for(int i=1;i<(60/x);i++)
	{
		for(int j = 1; j<(60/y); j++)
		{
			if((x*i)+(y*j)==result)
			{
				System.out.println("("+i+","+j+")");
			}
		}
	}

}}