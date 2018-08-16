package my.day8;

import my.util.MyUtil;

public class Member2Main {

	public static void main(String[] args) {
		
		// 2. 메인메소드에서 가입 검사 및 회원가입 출력하기
		Member2[] memberArr = new Member2[2];
		
		
		
		// -----------첫번째 배열에 들어갈 값------------
		String userid = "leess";
		String passwd = "qwer1234$";
		String name = "이순신";
		String addr = "서울시 종로구";
		
		// a) 여기서 패스워드 검사를 먼저 함
		if(MyUtil.checkPassword(passwd)) { // MyUtil.checkPassword()의 값이 True로 나왔을 때 돌아감
			// true가 나왔을 때 아래와 같이 객체 생성
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			
			if(Member2.count <= memberArr.length) { // 배열의 길이보다 객체 생성한 수가 작거나 같을때 배열에 넣음
			memberArr[0]=mem1;
			System.out.println(">> 회원가입 성공 <<");
			}
			else { // 배열 길이보다 count가 더 많으면 객체를 아예 null로 만들어 없앰
				mem1=null;
			}
			
		} // 첫번째 if의 끝
		else {
			System.out.println(">> 회원가입 실패 <<");
		}
			
		
		// -----------두번째 배열에 들어갈 값------------
		
		userid = "hansk";
		passwd = "abcd1234$";
		name = "한석규";
		addr = "서울시 강남구";
		
		// a) 여기서 패스워드 검사를 먼저 함
		if(MyUtil.checkPassword(passwd)) { // MyUtil.checkPassword()의 값이 True로 나왔을 때 돌아감
			// true가 나왔을 때 아래와 같이 객체 생성
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			
			if(Member2.count <= memberArr.length) {
				memberArr[1]=mem1;
				System.out.println(">> 회원가입 성공 <<");
			}
			else {
				mem1=null;
			}
			
		} // 첫번째 if의 끝
		else {
			System.out.println(">> 회원가입 실패 <<");
		}
		
		
		// -----------세번째 배열에 들어갈 값------------
		// Q.배열 사이즈를 2로 했을 때 초과하는 배열에 넣으면 어떻게 될까?
		// ==> ArrayIndexOutOfBoundsException 오류 뜸
		
		userid = "dusk";
		passwd = "asdf1234$";
		name = "두석규";
		addr = "서울시 강북구";
		
		// a) 여기서 패스워드 검사를 먼저 함
		if(MyUtil.checkPassword(passwd)) { // MyUtil.checkPassword()의 값이 True로 나왔을 때 돌아감
			// true가 나왔을 때 아래와 같이 객체 생성
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
//			memberArr[2]=mem1; // ArrayIndexOutOfBoundsException 오류!

			if(Member2.count <= memberArr.length) {
				memberArr[2]=mem1;
				System.out.println(">> 회원가입 성공 <<");
			}
			else {
				mem1=null;
			}
				
		}
		else {
			System.out.println(">> 회원가입 실패 <<");
		}
	
		
	} // end of main()

} // end of class
