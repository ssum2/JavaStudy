package my.day12.InheritanceEX;

public class Man extends Human { // Man클래스에서 Human클래스의 내용을 상속한다
	
	/*
	  	> JAVA에서는 다중 상속이 불가능! -> Human, Saram 클래스 두가지를 상속할 수 없음
	  		cf) C++ 에서는 다중상속 가능
	  	> 자바에서는 인터페이스(interface)로 "다중 구현" 처리함
	 */

	// Man에만 있는 요소
	String goArmyDay;

	public Man() {
//		super(); 
//		> 이 클래스에서 기본생성자를 만들 때 부모클래스의 기본생성자를 호출하는 메소드
//		> ※부모클래스의 기본생성자가 가장 먼저 있어야함※
//		> super()는 쓰지 않더라도 생략되어있을 뿐 계속 작동함		
		System.out.println("== Man의 기본 생성자를 호출! ==");
	}

	public Man(String name, float height, int weight, String goArmyDay) {
		super(name, height, weight); // 부모클래스에 있는 생성자
		this.goArmyDay = goArmyDay;
	}
	
	public void showGoArmyDay() {
		System.out.println(">> "+super.name+"님의 입대일자: "+goArmyDay);
		// Man클래스에는 name이 없지만 Human을 상속받았기 때문에 그 안에 있는 멤버변수 메소드 다 쓸 수 있음
		// 그냥 써도 상관 없지만 구분을 주기 위해 "super.~" 라고 기재, 자식클래스 내에서는 "this.~"써도 됨
	}

	@Override // Override(오버라이드): 부모클래스에서 정의한 메소드를 자식클래스에서 재정의 하는 것
	public void showInfo() {
		super.showInfo();
		System.out.println("4.입대일자: "+goArmyDay);
		System.out.println("==================");
	}
	
	
}
