package my.day12.AccessModifier;

public class AccessModifierTestMain {
// 동일 패키지 내에 있는 타 클래스
	
	public static void main(String[] args) {
		AccessModifierTest obj = new AccessModifierTest();
		
		System.out.println("사용자 ID: "+obj.userid); // public
		System.out.println("사용자 PW: "+obj.passwd); // protected
		System.out.println("사용자 NAME: "+obj.name); // default
		System.out.println("사용자 ADDRESS: "); // private >> 접근제한됨
	
	} // end of main()
} // end of class
