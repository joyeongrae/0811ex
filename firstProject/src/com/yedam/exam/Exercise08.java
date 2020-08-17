package com.yedam.exam;

import java.util.Scanner;

//사용자의 입력 값 :3개받아서 작은수 ->큰수로 출력하는 프로그램.(Scanner 클래스활용)
public class Exercise08 {
	
public static void main(String[] args) {
	
	int temp=0;
	Scanner scanner = new Scanner(System.in);
	int[] input=new int[5];
	for(int i =0;i<input.length;i++)
	{		
		input[i]=scanner.nextInt();
	}	
	for(int i = 0 ; i <  input.length -1 ; i ++) {
		for(int j = i+1 ; j < input.length ; j ++) {
			if(input[i] > input[j]) {
				temp = input[j];
				input[j] = input[i];
				input[i] = temp;
			}
		}
	}		
	//	for(int i =0;i<3;i++)
	//  {
		System.out.println(input[4]);
	//             }
}
}
