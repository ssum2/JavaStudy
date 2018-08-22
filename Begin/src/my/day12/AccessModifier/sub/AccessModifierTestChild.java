package my.day12.AccessModifier.sub;
import my.day12.AccessModifier.AccessModifierTest;
//다른 패키지에 있는 클래스에서 상속받아오기 때문에 import

public class AccessModifierTestChild extends AccessModifierTest { 
// 다른 클래스에 있는 자식클래스
	
	String email = "super@gmail.com";
	
	public void show() {
		super.userid = "batman"; // this도 동일함(해당 클래스 내에 동일한 변수가 없으면)
		this.passwd = "asdf1234$";
//		this.name 접근제한자 default라서 안 뜸
//		this.address 접근제한자 private라서 안 뜸
		
		
	}
	
} // end of class
