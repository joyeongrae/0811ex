package com.yedam.ref;

public class ArrayExample {

	public static void main(String[] args) {
		
		int score1 = 10, score2 =20, score3 =30, score4=40;
		score2 =50;
		//int sum = score1 + score2 + score3 + score4;
		
		int[] intAry = {10, 20, 30, 40};
		//sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		intAry[1] = 50; //이렇게 다시 변수 초기화가능  20 -> 50
		
		System.out.println(intAry.length); //배열 크기 
		
		
		int sum = 0;
		for(int i =0 ; i<4;i++)        // 4 대신에 intAry.length쓸 수 있다.
		{
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println(sum);
		
		String[] sAry = {"hello", "world", "nice","good"};
		for(int i =0; i<sAry.length; i++)
		{
			System.out.println(sAry[i]);
		}
		
		sum = 0;
		String[] scoreAry = new String[5];
		scoreAry[0]="one";
		scoreAry[1]="two";
		scoreAry[2]="three";
		for(int i = 0; i <scoreAry.length;i++)
		{
			System.out.println(scoreAry[i]);
		}
		
		int[] mathAry;
		mathAry =new int[]{1,2,3,4};
		
	}
	
	
}
