package my.util;

import java.util.Date;
import java.util.Random;

public class MyUtil {

	public static void currentTime() {
		Date now = new Date();
		String today = String.format("%tF %tT", now, now);
		System.out.println(today);
	}
	
	
	public static int calcuration(int a, int b, int c) {
		
		return a+b+c;
	}
	
	
	public static int random(int a, int b) {
		// 랜덤한 정수 = (int)(Math.random()*구간범위) + 시작값; 
		
		return (int)(Math.random()*(b-a+1)) + a;
	}
	
	public static int random2(int a, int b) {
		Random rnd = new Random();
		return rnd.nextInt(b-a+1)+a;
	}
	
	
	public static boolean checkPassword(String passwd) {
		
		if(passwd.length() < 8) {
			System.out.println(">> 암호는 8글자 이상이어야 합니다.");
			return false;
		}
		else {
			char[] chArr = passwd.toCharArray();
			boolean flagAlphabet=false, flagNumber=false, flagSpecial=false; 
			for(int i=0; i<chArr.length; i++) {
				if('A' <= chArr[i] && chArr[i] <= 'Z' || 
				   'a' <= chArr[i] && chArr[i] <= 'z') 
					flagAlphabet=true;
				else if('0' <= chArr[i] && chArr[i] <= '9')
					flagNumber=true;
				else
					flagSpecial=true;
			}// end of for--------------------
			
			if(flagAlphabet && flagNumber && flagSpecial) {
				System.out.println(">>"+ passwd +"는 암호로 사용가능합니다.");
				return true;
			}
			else {
				System.out.println(">> 암호는 영문자, 숫자, 특수기호가 혼합되어야만 사용가능합니다."); 
				return false;
			}
		}
	}
	
	
	
}
