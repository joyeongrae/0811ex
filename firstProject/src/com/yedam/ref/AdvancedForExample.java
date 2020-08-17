package com.yedam.ref;
import java.util.Scanner;
public class AdvancedForExample {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int[] score = new int[5];
	
	for(int i = 0; i< score.length;i++) //배열 크기만큼 입력
	{
		System.out.print("점수를 입력하세요");
		score[i] = scn.nextInt();
	}
	
	//int [] scores = {95, 71, 84, 93, 87};
	int sum = 0; //합
	int maxVal = 0; //최고값
	
	for (int i= 0;i<score.length;i++)
	{
		sum = sum + score[i];
	}
	System.out.println("총합 " + sum );
	
	double avg = sum / score.length;
	System.out.println("평균은 " + avg);
	
	
	
	
}
}
