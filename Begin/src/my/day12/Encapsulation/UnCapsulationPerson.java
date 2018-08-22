package my.day12.Encapsulation;
/*
	캡슐화가 되지 않은 상태
*/
public class UnCapsulationPerson {
	String 	name;
	int		age;
	double 	height;
	
	// UnCapsulationPerson 객체의 속성 정보값을 출력해주는 메소드 생성
	public void showInfoPerson() {
		System.out.println("1.성명: "+name);
		System.out.println("2.나이: "+age+"세");
		System.out.println("3.신장: "+height+"cm");
	}
		
} // end of class
