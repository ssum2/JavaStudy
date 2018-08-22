package my.day12.Encapsulation;
// 캡슐화: 직접 값을 바꾸지 못하게 접근제한자를 걸고, 값을 개발자의 의도대로 쓰게 하기 위해(유효성검사) 메소드로 기능을 만듦


/*
 	> 캡슐화(은닉화)
 		- 접근제한자(접근지정자, accessmodifier)
 		 												다른 패키지에 있는
 						현재 클래스 내부	동일 패키지에 있는 타 클래스	하위(자식)클래스		그 외의 영역
 			public			O				O				O				O
 			protected		O				O				O				X
 			default			O				O				X				X
 			private			O				X				X				X	
 */
public class CapsulationPerson {
	
	private String	name; // private; 이 클래스에서만 쓰겠다는 뜻. 접근제한자
	private int		age;
	private double	height;
	
	public void setName(String name) {
		if(name.trim().isEmpty()) 	// 유효성검사
			System.out.println(">> 성명은 공백만으로 입력 불가능합니다 <<");
		else
			this.name=name;
	}
	public String getName() { 		// private로 막혀있으니까 이 값을 불러오기 위해서는 메소드화 해야함(리턴O)
		return name;
	}
	
	public void setAge(int age) {
		if( age <= 0 ) 
			System.out.println(">> 나이는 0보다 커야 합니다. <<");
		else
			this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		if( height<=0 )
			System.out.println(">> 신장은 0보다 커야 합니다. <<");
		else
			this.height = height;
	}
	public double getHeight() {
		return height;
	}
	

	// CapsulationPerson 객체의 속성 정보값을 출력해주는 메소드 생성
	public void showInfoPerson() {
		System.out.println("1.성명: "+name);
		System.out.println("2.나이: "+age+"세");
		System.out.println("3.신장: "+height+"cm");
	}
	
} // end of class
