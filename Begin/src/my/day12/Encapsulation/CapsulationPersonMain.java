package my.day12.Encapsulation;

public class CapsulationPersonMain {

	public static void main(String[] args) {
		
		CapsulationPerson person = new CapsulationPerson();
		
		// person.찍으면 뒤에 private한 요소들은 전혀 나오지 않음(캡슐화됨) -> 개발자의 의도대로 하기 위해서 다른 사용자가 바꾸지 못하게끔 함
		person.setName("홍길동");
		person.setAge(26);
		person.setHeight(178.9);
		
		System.out.println(">> "+person.getName()+"님의 나이는 "+person.getAge()+"세, 신장은 "+person.getHeight()+"cm 입니다.<<");
		// 홍길동님의 나이는 26세, 신장은 178.9cm 입니다.
		
		person.showInfoPerson();
		
		
	} // end of main()

} // end of class
