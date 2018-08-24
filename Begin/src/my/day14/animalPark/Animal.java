package my.day14.animalPark;
// Dog Cat Duck의 공통요소
/*
 	>> 미완성 클래스(추상 클래스); 객체로 생성할 수 없는 클래스
 		- 일반클래스의 부모클래스로 사용
 		- class 앞에 "abstract"를 붙여서 사용
 		- 미완성메소드(추상메소드)를 가짐
 			> 미완성메소드를 두는 이유는 자식클래스에서 메소드의 오버라이딩(재정의)을 하기 때문
 		- 접근제한자와 abstract 위치는 뒤바뀌어도 상관없음
 			
 		
 */
abstract public class Animal {	// 미완성클래스: 미완성메소드를 내포하는 클래스
	static int count;
	
	private String name;
	private int age;
	
	public Animal() {count++;}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
//	공통기능(메소드)
	
	abstract public void crySound(); 
	// 미완성메소드: 안에 들어갈 값이 각 자식클래스마다 달라지기 때문에 반드시 메소드내용을 재정의 하라는 의미로 미완성메소드로 만들어줌 

} // end of class
