package my.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

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
	
	
	// 범위 내 랜덤 정수 나타내기
	public static int random2(int a, int b) {
		Random rnd = new Random();
		return rnd.nextInt(b-a+1)+a;
	
	}
	
	// 패스워드 검사 유틸
	public static boolean checkPassword(String passwd) {
		if(passwd.length() < 8) {
			System.out.println(">> 암호는 8자 이상이어야 합니다.");
			return false;	
		}
		else {
		char[] chArr=passwd.toCharArray();
		boolean flagAlphabet  = false, flagNumber = false, flagSpecial = false;
		
		for(int i=0; i<chArr.length; i++) {
			
			if('A'<=chArr[i] && chArr[i]<='Z' ||
			   'a'<=chArr[i] && chArr[i]<='z') {
				flagAlphabet=true;
				
			}
			else if('0'<=chArr[i] && chArr[i]<='9')
				flagNumber=true;
			else
				flagSpecial = true;		
		}// end of for
		
		if(flagAlphabet && flagNumber && flagSpecial) {
			System.out.println(">> "+passwd+"는 암호로 사용 가능합니다 <<");
			return true;
		
		}
		else {
			System.out.println(">> 암호는 영문자, 숫자, 특수기호가 혼합되어야 합니다 <<");
			return false;
		}
		
		}
	}
	
	
	// 현재 시각 나타내기; 내가 한 것
	public static String currentTime2() {
		Calendar currentdate = Calendar.getInstance();
		int year = currentdate.get(Calendar.YEAR);
		int month = currentdate.get(Calendar.MONTH)+1;
		String strMonth = month<10? "0"+month:String.valueOf(month);
		
		int day = currentdate.get(Calendar.DATE);
		String strDay = day<10?"0"+day:String.valueOf(day);
		
		
		int dayname = currentdate.get(Calendar.DAY_OF_WEEK);
		String strDayname ="";
		switch (dayname) {
		case 1:
			strDayname ="일요일";
			break;
		case 2:
			strDayname ="월요일";
			break;
		case 3:
			strDayname ="화요일";
			break;
		case 4:
			strDayname ="수요일";
			break;
		case 5:
			strDayname ="목요일";
			break;
		case 6:
			strDayname ="금요일";
			break;
		case 7:
			strDayname ="토요일";
			break;
		
		}
		
		 int min = currentdate.get(Calendar.MINUTE);
	        int sec = currentdate.get(Calendar.SECOND);
	        String strMin = min<10?"0"+min:String.valueOf(min);
	        String strSec = sec<10?"0"+sec:String.valueOf(sec);
	        
		return year+"-"+strMonth+"-"+strDay+" "+currentdate.get(Calendar.HOUR_OF_DAY)+":"+strMin+":"+strSec+" "+strDayname;
	}
	
	
	// 현재 시각 나타내기; 강사님이 한 것
	public static String currentTime3() {
		
		Calendar currentdate = Calendar.getInstance();
		int year = currentdate.get(Calendar.YEAR);
		
		int month = currentdate.get(Calendar.MONTH)+1;
		String strMonth = month<10?"0"+month:String.valueOf(month);
		
		int day = currentdate.get(Calendar.DATE);
		String strDay = day<10?"0"+day:String.valueOf(day);
		
		 String today = year+"-"+strMonth+"-"+strDay;
	        int min = currentdate.get(Calendar.MINUTE);
	        int sec = currentdate.get(Calendar.SECOND);
	        String strMin = min<10?"0"+min:String.valueOf(min);
	        String strSec = sec<10?"0"+sec:String.valueOf(sec);
	        
	        today += " " +currentdate.get(Calendar.HOUR_OF_DAY)+":"+strMin+":"+strSec;
	        
	        switch (currentdate.get(Calendar.DAY_OF_WEEK)) {
				case 1:
					today += " 일요일";
					break;
				case 2:
					today += " 월요일";
					break;	
				case 3:
					today += " 화요일";
					break;
				case 4:
					today += " 수요일";
					break;
				case 5:
					today += " 목요일";
					break;
				case 6:
					today += " 금요일";
					break;	
				case 7:
					today += " 토요일";
					break;
			}
	        
	        return today;
	}
	
	
	
	// 생년월일 출력 (문자열 중 숫자만 들어가도록 유효성검사); 내가 만든 것
	public static boolean checkNumber(String num) {
		char[] chArr=num.toCharArray();
		boolean flagAlphabet  = false, flagNumber = false, flagSpecial = false;
		
		for(int i=0; i<chArr.length; i++) {
			
			if('A'<=chArr[i] && chArr[i]<='Z' ||
			   'a'<=chArr[i] && chArr[i]<='z') {
				flagAlphabet=true;
				
			}
			else if('0'<=chArr[i] && chArr[i]<='9')
				flagNumber=true;
			else
				flagSpecial = true;		
		}// end of for
		
		if(!flagAlphabet && flagNumber && !flagSpecial) {
			return true;
		
		}
		else  {
			return false;
		}
	}
	
	// 생년월일 출력 (문자열 중 숫자만 들어가도록 유효성검사); 강사님이 만든 것
	public static boolean checkNumber1(String str) {
		boolean boolFlag = false;
		
		char[] chArr = str.toCharArray(); // 글자 한개씩 배열에 넣어 검사
		for(int i=0; i<chArr.length; i++) {
			if( !('0'<=chArr[i] && chArr[i]<='9') ) { // 숫자 범위가 아니라면
				boolFlag = true; // 숫자 범위가 아닐 때 true로 바뀜
				break; // 숫자가 아닌 게 있으면 그 이후는 검사할 필요 없으니까 for문 빠져나감
			}
		}
		if(!boolFlag) { // boolFlag가 false상태 그대로면 숫자만 있음
			return true;
		}
		else {
			return false;
		}
		
	} // end of checkNumber1()
	
	
	
	
} // end of class
