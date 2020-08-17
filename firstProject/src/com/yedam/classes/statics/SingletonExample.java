package com.yedam.classes.statics;
import com.yedam.classes.Person; // 다른 패키지의 클래스 참조
public class SingletonExample {

	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2)
		{
			System.out.println("동일한 instance 입니다.");
		}
		else {
			System.out.println("다른 instance입니다.");
		}
		
		Person p1 = new Person();
		p1.setName("111"); //person클래스의 setName메소드가 public으로 설정
		
		
	}
}
