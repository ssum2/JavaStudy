package my.day14.interfaceEx;
/*
 	>> 인터페이스(Interface)
 		- 모든 메소드가 추상메소드(미완성메소드), 모든 멤버변수(속성)들은 상수변수(final변수; 고정값)로만 구성
 		- 클래스의 상속은 다중상속(extends)이 불가능하지만, 인터페이스는 다중구현(implements)이 가능
 		
 */
public interface InterAnimal {
//	> 인터페이스에서 선언한 변수는 항상 public final static 생략된 상수변수가 됨
	float PI = 3.14f;	// == public final static float PI = 3.14f;
	
//	> 인터페이스에서 선언한 메소드는 반드시 미완성메소드여야함. {} 들어가면 오류!
//	> 메소드를 만들 때  public abstract가 자동으로 붙음(생략되어 있음)

	void crySound();	// 동물이 되려면 우는 기능을 구현해야함
	String run();		// 동물이 되려면 이동하는 방법을 알려줘야함
	int showAge();			// 현재 나이를 알려줘야함
	String grade(String level);		// 동물의 등급 가중치를 문자열("A","B","C","D")로 입력받아서 등급문자열("최우수","우수","보통","최하")로 알려줘야함
	
	
	
}
