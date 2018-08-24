package my.day14.interfaceEx;

public class Dog implements InterAnimal {

	private String name;
	private int age;
	private int weight;
	
	
	
	
	public Dog() {}
	public Dog(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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
		String result ="강아지 "+name+"가 네 발로 달립니다.";
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
	}	// 메소드를 재정의함

}
