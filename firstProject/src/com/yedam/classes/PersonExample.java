package com.yedam.classes;

public class PersonExample {
public static void main(String[] args) {
	Person p1 = new Person(); //클래스 생성
	p1.setName("조영래");
	p1.setAge(28);
	
	System.out.println(p1.getName());
	System.out.println(p1.getAge());
	
	Person cjy = new Person();  //name:최재영, age:25
	System.out.println(cjy.introduce()); //입력 set전에 출력가능
	cjy.setName("최재영");
	cjy.setAge(25);
	System.out.println(cjy); //person이라는 class안의 주소
	
	Person ksm = new Person();
	ksm.setName("김상민");
	ksm.setAge(26);
	
	Person ksm2 = new Person();
	ksm2.setName("김상민");
	ksm2.setAge(26);
	
	
	System.out.println(ksm); //주소가 다르다
	System.out.println(ksm2);
	
	System.out.println(ksm.getName()==(ksm2.getName())); //문자열 비교(Name) : true
	
	Person[] pAry = {cjy, ksm, ksm2}; //배열도 가능
	
	for(int i =0; i<pAry.length; i++)
	{
		pAry[i].introduce();
	}
	
	System.out.println(cjy.introduce());
	System.out.println(ksm.introduce());
	
	Person anoy = new Person("민해주"); //미리 값이 들어감 초기화선언
	System.out.println(anoy.introduce());

	Person hsj = new Person("허성준", 20);
	hsj.setName("이광호"); //다른 값으로 초기화 가능
	hsj.setAge(23);
	System.out.println(hsj.introduce());


}
}
