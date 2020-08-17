package com.yedam.dev;

public class MorningCode13 {
public static void main(String[] args) {
	int score = 95;
	int sum = 0;
	for(int i = 0; i<10;i++)
	{
		for(int j = 0; j<10;j++) {
			sum = sum+j;
		
		System.out.println(j);
		}
	}
	
	int n = 0;
	while(true)
	{
		if(n++==5) {
			break;
		}
		else if(n==3)
		{
			continue;
		}
		
	}
	
	
	int a = 0;
	int b = 0;
	while(a<10)
	{
		while(b<10)
		{
			a++;
			b++;
			System.out.println("z");
		}
	}
	

	if(score>=90)
	{
		System.out.println("95이상입니다");
	}
	else if(score >= 90)
	{
		System.out.println("90이상입니다");
		
	}else if (score >=80) {
		System.out.println("80이상입니다");
		
		
	}else 
	{
		System.out.println("80미만입니다");
	}

	
	
	int x= 0;
	for(int u = 0; u>10;u++)
	{
		if(u%2 !=0)
		
			continue;
			System.out.println(u);
		
	}
	
}
}
