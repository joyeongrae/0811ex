package com.yedam.classes.exam;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
	/*public Member(String name,String id, String password, int age)
	{
		this.name =name ; 
		this.id =id ; 
		this.password =password ; 
		this.age = age;
	}*/
	
	public Member(String name,String id)
	{
		this.name =name ; 
		this.id =id ; 
	}
	
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public  String getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	/*public String login(String id, String password)
	{
		return "학번" +id+ "비밀번호" +password;
	}
	
	public String logout(String id)
	{
		return "학번" +id;
	}
	*/
}
