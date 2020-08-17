package com.yedam.ref;

public class MorningCode {
public static void main(String[] args) {
	
	double[]dAry = new double[5];
	dAry[0] = 1.2;
	
	for(int i = 0;i<5;i++)
	{
		System.out.println(dAry[i]);
	}
	
	
	int[][] iAry = new int[5][5];
	
	int num1 = 1;
	
	for(int i = 0;i<iAry.length;i++)
	{
		for(int j = 0; j<iAry.length;j++)
		{
			iAry[i][j]=num1++;
			System.out.printf("%3d",iAry[i][j]); //자리 맞춤
		}
		System.out.println();
	}
	
	
	System.out.println();
	System.out.println();
	
	
	for(int i = 0;i<iAry.length;i++)
	{
		for(int j = 0; j<iAry.length;j++)
		{
	 
			System.out.printf("%3d",iAry[j][i]); //자리 맞춤
		}
		System.out.println();
	}
	
	
	
	
	
		
}
}
