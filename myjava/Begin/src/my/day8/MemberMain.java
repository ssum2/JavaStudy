package my.day8;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Member[] memberArr = new Member[5];
		
	/*	
		for(int i=0; i<memberArr.length; i++) {
			System.out.println("memberArr["+i+"] => " + memberArr[i]); 
		}
	*/	
		/*
		    memberArr[0] => null
			memberArr[1] => null
			memberArr[2] => null
			memberArr[3] => null
			memberArr[4] => null 
		 */
		
		Member mem1 = new Member();
		boolean bool = mem1.makeMember("leess", "abcd1234$", "이순신", "서울시 종로구");
		
		if(!bool) mem1 = null;
		System.out.println(mem1.name); 
				
		if(mem1 != null) {
		   memberArr[0] = mem1;	
		}
			

	}

}
