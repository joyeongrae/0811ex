package com.yedam.classes.exam;

public class Account {

	 int money;
	
	public Account(int money )
	{   
		
		this.money =money ; 
		
	}
	
	public void setBalance(int money)
	{
		if(money>=0 & money<1000000)
		{
		this.money = money;
		}
		
	}
	public int getBalance()
	{
		return money;
	}
	
}
