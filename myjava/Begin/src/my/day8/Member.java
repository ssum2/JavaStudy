package my.day8;

import my.util.MyUtil;

public class Member {

	String userid;
	String passwd;
	String name;
	String addr;
		
	public Member() { }
	
	public boolean makeMember(String userid, String passwd, String name, String addr) {
		
		boolean bool = MyUtil.checkPassword(passwd);
		
		if(!bool) {
			System.out.println(">> 사용불가한 암호로 인해서 회원가입 실패!!");
		    return false;
		}
		else {
			this.userid = userid;
			this.passwd = passwd;
			this.name = name;
			this.addr = addr;
			System.out.println(">> 회원가입 성공!!");
			return true;
		}
	}
	
	
	
}
