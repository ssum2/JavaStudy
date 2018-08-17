package my.day3;

public class Heowon {

	String userid;
	String passwd;
	String name;
	int age;
	String addr;
	
	public void showInfo() {
		System.out.println("=== "+name+"님의 정보 ===");
		System.out.println("1.아이디 : " + userid);
		System.out.println("2.암 호 : " + passwd);
		System.out.println("3.성 명 : " + name);
		System.out.println("4.나 이 : " + age);
		System.out.println("5.주 소 : " + addr);
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
