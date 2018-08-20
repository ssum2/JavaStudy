package my.day11;

import my.util.MyUtil;

public class Test {

	public static void main(String[] args) {

		String str1 = "";
		String str2 = "     ";
		String str3 = "abcd";
		String str4 = " ab cd ";
		
		// 문자열.isEmpty == 해당 문자열이 비어있는지 아닌지를 boolean값으로 반환 -> empty: true
		System.out.println("str1.isEmpty() => "+str1.isEmpty()); // true
		System.out.println("str2.isEmpty() => "+str2.isEmpty()); // false
		System.out.println("str3.isEmpty() => "+str3.isEmpty()); // false
		
		System.out.println("\n");
		
		// 문자열.trim() : 문자열 좌우에 공백이 있으면 그 공백을 없애줌
		System.out.println("str1.trim().isEmpty() => "+str1.trim().isEmpty()); // true
		System.out.println("str2.trim().isEmpty() => "+str2.trim().isEmpty()); // true
		// 좌우 공백을 제거하기 때문에 str2는 null이 됨
		
		System.out.println("str3.trim().isEmpty() => "+str3.trim().isEmpty()); // false
		
		System.out.println("ttt"+str4+"ttt"); // ttt ab cd ttt
		System.out.println("ttt"+str4.trim()+"ttt"); // tttab cdttt
		
		
		System.out.println("===========================================");
		System.out.println(MyUtil.checkNumber1("120345")); //true
		System.out.println(MyUtil.checkNumber1("120ab45")); // false
		
		
		
	} // end of main

} // end of class
