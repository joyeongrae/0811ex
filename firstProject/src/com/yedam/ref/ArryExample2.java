package com.yedam.ref;

public class ArryExample2 {

	public static void main(String[] args) {
		
		int[] numAry = {2,4,5,3,5};
		int result = addAry(numAry); //add(new int[] {2,3,4});
		System.out.println("배열의 합: "+result);
		int result2 = add(3);
		System.out.println(result2);
		
	}
		
	public static int add(int a)
	{
		return a*3;
	}
	public static int addAry(int[] ary)
	{
		int sum = 0;
		for(int i =0; i<ary.length;i++)
		{
			sum += ary[i];
	}
	return sum;
}
}