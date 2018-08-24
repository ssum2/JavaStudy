package my.day14.animalPark;

public class Dog extends Animal {

	private int weight;
	
	
	public Dog() {}
	public Dog(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight<0)
			this.weight = 0;
		else
			this.weight = weight;
	}

	// === 메소드의 오버라이딩(재정의) ===
			// 조건이 부모클래스에 존재하는 메소드이어야 한다.
			// 또한 부모클래스에 존재하던 메소드의 내용물을 뺀 나머지(껍데기)는 똑같아야 한다.
			// 단, 접근지정자(접근제한자)은 부모클래스의 것과 동일하든지 아니면 
			// 부모클래스의 것보다는 제한범위가 더 큰쪽으로 해야한다.
			// 예를들어, 
			// - 부모클래스의 메소드 접근지정자가 public 이라면
			//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 만 가능하다.
			// - 부모클래스의 메소드 접근지정자가 protected 이라면
			//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 또는 protected 만 가능하다.
			// - 부모클래스의 메소드 접근지정자가 public 이라면
			//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 protected 는 불가하다.

	@Override
	public void crySound() {
		System.out.println("멍멍");
	}
	
	public void printDog() {
		String str = "강아지의 이름은 "+getName()+","+
					 "강아지의 나이는 "+getAge()+"살,"+
					 "강아지의 몸무게는 "+weight+"kg 입니다.";
		
		System.out.println(str+"\n");
	}
	
	
	@Override
	public String toString() {	// 조상클래스인 Object의 메소드 toString을 오버라이딩함
		
		String result = "\t=== "+getName()+"님의 정보===\n"+
						"\t\t\t1. 이름: "+getName()+"\n"+
						"\t\t\t2. 나이: "+getAge()+"\n"+
						"\t\t\t3. 체중: "+weight+"\n";
	
		return result;
		
	}
	
}
