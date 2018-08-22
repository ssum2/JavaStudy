package my.day12.Encapsulation;

public class UnCapsulationPersonMain {
// 캡슐화가 되지 않은 경우 객체 만들어서 . 찍으면 뒤에 캡슐화가 되지 않은 요소들이 다 보임
	
	public static void main(String[] args) {
		UnCapsulationPerson person1 = new UnCapsulationPerson();
		person1.name = "홍길동";
		person1.age = 25;
		person1.height = 175.6;
		
		person1.showInfoPerson();
		
		System.out.println("\n-----------------------\n");
		
		UnCapsulationPerson person2 = new UnCapsulationPerson();
		person2.name = "이순신";
		person2.age = -234;
		person2.height = -0.75;
		
		person2.showInfoPerson();

	}

}
