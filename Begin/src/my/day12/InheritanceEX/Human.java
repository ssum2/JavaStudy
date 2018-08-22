package my.day12.InheritanceEX;
/*
 	> 상속(Inheritance)
		- 어떤 클래스들을 생성할 때 공통적인 추상화 결과물(멤버변수, 메소드)이 있을 때,
		    이를 빼내어 새로운 클래스(부모 클래스)를 만들어 관리 -> 개발/유지보수 측면에서 좋음
		- 부모클래스에서 수정하면 자식클래스에 일괄 적용됨
		- 클래스들의 교집합: 부모클래스
		- 클래스들의 교집합을 상속받는 클래스: 자식클래스
 */
public class Human {
//	Woman, Man 공통요소
	String name;
	float  height; 
	int    weight;
	
	public Human() {
		System.out.println(">> Human의 기본 생성자를 호출! <<");
	}
	
	public Human(String name, float height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() { // man woman 둘다 사용 가능
		System.out.println("\n====== INFO ======");
		System.out.println("1.성명: "+name);
		System.out.println("2.신장: "+height+"cm");
		System.out.println("3.체중: "+weight+"kg");
	}
	
	public void haha() {
		System.out.println("hahaha");
	}
}
