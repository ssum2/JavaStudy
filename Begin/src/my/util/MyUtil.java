package my.util;

import java.util.Date;

public class MyUtil {

	//다른 클래스에서도 언제든지 날짜를 알고싶을때 -> static 메소드 생성
	//유틸리티처럼 자주 쓰는 것을 static으로 만들어두고, 이를 객체를 따로 생성하지 않고 바로 쓸 수 있게 함
	
	public static void currentTime() {
		Date now = new Date();
		String today= String.format("%tF, %tT", now, now); // 연-월-일 시:분:초
		System.out.println(today);
	}
	
	// 퀴즈: 파라미터, 리턴값이 있는 인스턴스변수를 static메소드를 만들어 다른 클래스에서 출력하기
	public static int calcuration(int a, int b, int c) {
//		int sum = a + b+ c;
//		return sum;
		return a+b+c;
	}
	
	// 랜덤 정수 나타내기: 내가 한 것
//	public static int random(int startNo, int endNo) {
//		int ran = (int)(Math.random()*(endNo-startNo)+1);
//		return ran;
//	}
	// 랜덤 정수 나타내기: 강사님이 한 것
	public static int random(int a, int b) {
		return (int)((Math.random()*(b-a+1))+a);
	}
	
} // end of class
