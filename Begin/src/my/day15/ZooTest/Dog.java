package my.day15.ZooTest;

public class Dog extends Animal {
	
	private int weight;

	
//	>> 생성자의 오버로딩
//	- 이름은 동일해도 파라미터가 다르면 오버로딩 가능
//	- 생성자 내에서 다른 생성자를 호출 가능
//	- 일반적으로 모든 멤버변수가 파라미터로 들어가있는 생성자를 만들고, 기본값을 설정하고 싶을 때 새로운 생성자에서 해당 생성자를 호출하면서 사용
	
	public Dog() {
		// super(); 생략
	}	
	public Dog(String name, int weight) {
//		this();						// Dog(){} 기본생성자를 호출한다
		this(name, 1, weight);		// Dog(String name, int age, int weight){} 호출		
	}
	public Dog(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}



	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public void crySound() {
		System.out.println("멍멍");		
	}

	@Override
	public String run() {
		String result ="강아지 "+getName()+"가 네 발로 달립니다.";
		return result;
	}
	
	@Override
	public int showAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
