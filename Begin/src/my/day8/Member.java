package my.day8;

import my.util.MyUtil;

public class Member {
	String userid;
	String passwd;
	String name;
	String addr;
	
	
	public Member() {} // 기본생성자 
	// private로 선언하면 이 클래스에서만 사용할 수 있음
	// 내가 원하는 포맷대로 입력하지 않으면 객체를 생성할 수 없도록 막아두는 것임
	// => 메인에서 쓰려면 메소드로 만들어 호출하면 됨
	
	
	
	
	public boolean makeMember(String userid, String passwd, String name, String addr) {
		
		boolean bool = MyUtil.checkPassword(passwd);
		
		if(!bool) {
			System.out.println(">> 사용 불가능한 암호로 인해 회원가입 실패 <<");
			return false;
		}
		else {
			this.userid = userid;
			this.passwd = passwd;
			this.name = name;
			this.addr = addr;
			
			
			System.out.println(">> 회원 가입 성공! <<");
			return true;
		}
	
	} // end of makeMember()
	
	
}// end of class
