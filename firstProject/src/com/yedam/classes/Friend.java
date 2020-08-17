package com.yedam.classes;

public class Friend {

	String name;
	String age;
	String phonenumber;
	
	
	public Friend(String name,String age, String phonenumber)
	{
		this.name =name ; 
		this.age =age ; 
		this.phonenumber =phonenumber ; 
	}
	
	public String introduce()
	{
		return "이름  " +name+ "  나이" +age+ " 폰번호"+phonenumber;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	public void setage(String age)
	{
		this.age = age;
	}
	public void setphonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	
}
