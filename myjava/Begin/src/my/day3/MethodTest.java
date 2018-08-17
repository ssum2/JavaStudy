package my.day3;

import my.util.MyUtil;

public class MethodTest {

	public static void main(String[] args) {
		
		Member.showCount();
		
		Member me = new Member();
        me.userid = "seoyh";
        me.pwd = "qwer1234$";
        me.name = "서영학";
        me.age = 25;
        Member.showCount();
        
        Member you = new Member("irin", "qwer1234$", "아이린", 30); 
        Member.showCount();
        
		// == 1. 리턴타입이 없는 메소드 호출하기 ==
        me.showInfo();
        you.showInfo();
        
        // == 2. 리턴타입이 있는 메소드 호출하기 ==
        String info = me.returnShowInfo();
        System.out.println(info);
        
        System.out.println("");
        
        info = you.returnShowInfo();
        System.out.println(info);
        
        // == 3. 리턴타입(반환타입)은 없고 매개변수(인자, 파라미터)가 있는 메소드 호출 하기 == 
        me.chageVal("abcd0070", 35);
        
        info = me.returnShowInfo();
        System.out.println(info);
		
        // == 4. 리턴타입(반환타입)도 있고 매개변수(인자, 파라미터)도 있는 메소드 호출 하기 == 
        info = me.returnChangeVal("asdf1111", 45);
        System.out.println(info);
        
        
        Member wonbin = new Member();
        wonbin.userid = "wonbin";
        wonbin.pwd = "abcd1234";
        wonbin.name = "원빈";
        wonbin.age = 41;
        Member.showCount();
        
        System.out.println("== 현재시각 ==");
        MyUtil.currentTime();
        
        System.out.println("");
        System.out.println("=== 퀴즈 ===");
        int sum = MyUtil.calcuration(2,5,8);
        System.out.println("sum => " + sum);
        // sum => 15
        
	}

}
