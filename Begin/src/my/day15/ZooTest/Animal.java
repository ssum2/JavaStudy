package my.day15.ZooTest;

public abstract class Animal implements InterAnimal {
/*
	추상클래스 Animal.class에 InterAnimal.interface를 구현
	interface의 메소드는 실사용하는 해당 클래스에서 오버라이딩(부모클래스에서 구현 안한 것을 자식클래스에서 반드시 구현해야함)
	부모클래스인 Animal.class에서는 메소드를 재정의X ==> 빨간줄 ==> 미완성클래스! (abstract)
	
	=> 인터페이스를 부모클래스에 구현하고, 부모클래스에서는 공통적인 멤버변수를 선언해서 사용
*/
	static int count;
	
	private String name;
	private int age;
	


	public Animal() {count++;}
	public Animal(String name, int age) {
		super();
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
}
