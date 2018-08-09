package my.day3;

import my.util.MyUtil;

public class MethodTest {

	public static void main(String[] args) {
		
		//객체를 만들기 전
		Member.showCount();
		
		
		Member me = new Member();
		Member.showCount();
		me.userid = "Baesumi";
		me.userpw = "qwer1234!";
		me.name = "배수미";
		me.age = 27;
		
		
		Member you = new Member("Chaeunwoo", "asdf1234!", "차은우", 23);
		Member.showCount();
		// -----------------------------------------------------------------
		// 1. 리턴타입이 없는 메소드 호출
		//	- 메소드 : 어떤 동작, 행위
		
		me.showInfo();
		you.showInfo();
	
		
		System.out.println("\n-----------------------------");
		// 2. 리턴타입이 있는 메소드 호출
		
		String info = me.returnShowInfo();
		System.out.println(info);
		
		info = you.returnShowInfo(); // 위에 쓴 info 변수 재사용
		System.out.println(info);
		
		System.out.println("\n-----------------------------");
		// 3. 리턴타입이 없고 매개변수(인자, 파라미터)가 있는 메소드 호출
		
		me.changeVal("abcd0070$", 20);
		info = me.returnShowInfo();
		System.out.println(info);
		
		System.out.println("\n-----------------------------");
		//4. 리턴타입이 있고 매개변수가 있는 메소드 호출
		
		info = me.returnChangeVal("asdf1111", 30);
		System.out.println(info);
		
		
		Member wonbin = new Member();
		wonbin.userid = "wonbin";
		wonbin.userpw = "abcd1234!";
		wonbin.name = "원빈";
		wonbin.age = 41;
		Member.showCount();
		
		//static으로 만들어둔 메소드를 유틸리티로 활용
		System.out.println("=== 현재시각 ===");
		MyUtil.currentTime();
		
		System.out.println("");
		System.out.println("=======퀴즈=======");
		
		
		int sum = MyUtil.calcuration(2,5,8); //15
		System.out.println("sum => "+sum);
			
		
		
		
	}
	

}
