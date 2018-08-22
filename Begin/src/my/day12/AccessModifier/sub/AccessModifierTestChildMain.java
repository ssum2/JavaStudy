package my.day12.AccessModifier.sub;
import my.day12.AccessModifier.AccessModifierTest;


public class AccessModifierTestChildMain {
// 그 외의 영역
	
	public static void main(String[] args) {
		AccessModifierTest obj = new AccessModifierTest();
		
		System.out.println(obj.userid); // public
//		System.out.println(obj.email); AccessModifierTestChild의 default
//		System.out.println(obj.name); default
//		System.out.println(obj.address); private
//		System.out.println(obj.passwd); protected
		

	} // end of main()

} // end of class
