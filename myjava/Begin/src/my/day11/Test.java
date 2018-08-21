package my.day11;

import my.util.MyUtil;

public class Test {

	public static void main(String[] args) {
		
		String str1 = "";
		String str2 = "      ";
		String str3 = "abcd";
		String str4 = " ab cd ";
		
		System.out.println("str1.isEmpty() => " + str1.isEmpty()); 
		System.out.println("str2.isEmpty() => " + str2.isEmpty());
		System.out.println("str3.isEmpty() => " + str3.isEmpty());
		
		System.out.println("\n");
		
		System.out.println("str1.trim().isEmpty() => " + str1.trim().isEmpty()); 
		System.out.println("str2.trim().isEmpty() => " + str2.trim().isEmpty());
		System.out.println("str3.trim().isEmpty() => " + str3.trim().isEmpty()); 
		
		System.out.println("ttt"+str4+"ttt");
		System.out.println("ttt"+str4.trim()+"ttt");
		
		System.out.println("\n------------------\n");
		System.out.println(MyUtil.checkNumber("120345"));   // true     
		System.out.println(MyUtil.checkNumber("1203ab45")); // false 
		
	}

}
