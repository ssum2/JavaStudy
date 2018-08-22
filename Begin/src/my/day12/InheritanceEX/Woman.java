package my.day12.InheritanceEX;

public class Woman extends Human {
	// Woman만 있는 요소
	String dateEmployee;

	public Woman() {
//		super(); // 이 클래스에서 기본생성자를 만들 때 부모클래스의 기본생성자를 호출하는 메소드
		System.out.println("== Woman의 기본 생성자를 호출! ==");
	}

	public Woman(String name, float height, int weight, String dateEmployee) {
		super(name, height, weight);
		this.dateEmployee = dateEmployee;
	}
	
	public void showDateEmployee() {
		System.out.println(">> "+super.name+"님의 입사예정일: "+dateEmployee);
	}

	@Override // Override(오버라이드): 부모클래스에서 정의한 메소드를 자식클래스에서 재정의 하는 것
	public void showInfo() {
		super.showInfo();
		System.out.println("4.입사예정일: "+dateEmployee);
		System.out.println("==================");
	}

} // end of class
