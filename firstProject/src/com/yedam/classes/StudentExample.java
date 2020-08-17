package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		
	

	Student st1 =new Student(null);
	st1.setstuID("21212013");
	st1.setname("조영래");
	st1.setmajor("사랑과");
	
	System.out.println(st1.introduce());
	Student st2 =new Student(null);
	st2.setstuID("3213");
	st2.setname("예담");
	st2.setmajor("사랑과");
	System.out.println(st2.introduce());
	Student st3 =new Student(null);
	st3.setstuID("61241");
	st3.setname("김김김");
	st3.setmajor("나무과");
	System.out.println(st3.introduce());
	
	
	
	
	
	
	Student[] pAry = {st1, st2, st3};

	for(int i =0; i<pAry.length; i++)
	{
		pAry[i].introduce();
	}
	
	
	Student s4 = new Student("222","김유신","말타기");
	Student s5 = new Student("333","최재영","역사");
	Student s6 = new Student("444","민해주","말타기");
	
	String searchName = "김유신";
	String searchmajor= "역사";
	
	Student[] sAry = {s4,s5,s6};
	
	
	
	for(Student s : sAry)
	{
				
	if(s.getname().equals(searchmajor)){
		System.out.println(s.toString());
	}
			
		
				
	}
	
}
	}
