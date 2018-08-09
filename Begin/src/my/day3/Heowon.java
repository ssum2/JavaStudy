package my.day3;

import org.omg.Messaging.SyncScopeHelper;

public class Heowon {
	//멤버변수
	String userid;
	String userpw;
	String name;
	int age;
	String addr;
	//멤버변수 끝
	
	public void showInfo() {
		System.out.println("----- "+name+"님의 정보 -----");
		System.out.println("userid: "+ userid);
		System.out.println("userpw: "+ userpw);
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
		System.out.println("addr: "+ addr);
	}
	
	public void setUserid(String userid) {
		this.userid = userid; // 내 객체의 인스턴스 멤버변수에 지역변수를 대입
	}
	public void setPasswd(String userpw) {
		this.userpw = userpw;
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
	
} // end of class
