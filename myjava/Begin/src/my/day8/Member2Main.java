package my.day8;

import my.util.MyUtil;

public class Member2Main {

	public static void main(String[] args) {
		
		Member2[] memberArr = new Member2[2];
		
		String userid = "leess";
		String passwd = "qwer1234$";
		String name = "이순신";
		String addr = "서울시 종로구";
		
		if(MyUtil.checkPassword(passwd)) {
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			
			if(Member2.count <= memberArr.length) {
				memberArr[0] = mem1;
				System.out.println(">> 회원가입 성공!!");
			}
			else
				mem1 = null;
		}
		else {
			System.out.println(">> 회원가입 실패!!");
		}
		
		
		userid = "hansk";
		passwd = "abcd1234$";
		name = "한석규";
		addr = "서울시 강남구";
		
		if(MyUtil.checkPassword(passwd)) {
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			if(Member2.count <= memberArr.length) {
				memberArr[1] = mem1;
				System.out.println(">> 회원가입 성공!!");
			}
			else
				mem1 = null;
		}
		else {
			System.out.println(">> 회원가입 실패!!");
		}
		
		
		userid = "dusk";
		passwd = "asdf1234$";
		name = "두석규";
		addr = "서울시 강북구";
		
		if(MyUtil.checkPassword(passwd)) {
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			if(Member2.count <= memberArr.length) {
				memberArr[2] = mem1;
				System.out.println(">> 회원가입 성공!!");
			}
			else
				mem1 = null;
		}
		else {
			System.out.println(">> 회원가입 실패!!");
		}

	}

}
