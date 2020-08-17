package com.yedam.classes;

public class Student {

	String stuID;
	String name;
	String major;
	
	public Student(String stuID)
	{
		this.stuID =stuID ; 
	}
	
	public Student(String stuID,String name)
	{
		this.stuID =stuID ; 
		this.name =name ; 		
	}
	
	public Student(String stuID,String name, String major)
	{
		this.stuID =stuID ; 
		this.name =name ; 
		this.major =major ; 
	}
	
	public String introduce()
	{
		return "학번" +stuID+ "이름" +name+ " 전공"+major;
	}
	
	public void setstuID(String stuID)
	{
		this.stuID = stuID;
	}
	public String getstuID()
	{
		return stuID;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return name;
	}
	public void setmajor(String major)
	{
		this.major = major;
	}
	public String getmajor()
	{
		return major;
	}
	
	
	
	
	
	}

