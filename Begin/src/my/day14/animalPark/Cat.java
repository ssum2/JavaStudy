package my.day14.animalPark;

public class Cat extends Animal {

	private String color;
	
	
	public Cat() {}
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void crySound() {
		System.out.println("애옹");
		
	}
	public void printCat() {
		String str = "고양이의 이름은 "+getName()+","+
					 "고양이의 나이는 "+getAge()+"살,"+
					 "고양이의 색상은 "+color+" 입니다.";
		
		System.out.println(str+"\n");
	}
	@Override
	public String toString() {	// 조상클래스인 Object의 메소드 toString을 오버라이딩함
		
		String result = "\t=== "+getName()+"님의 정보===\n"+
						"\t\t\t1. 이름: "+getName()+"\n"+
						"\t\t\t2. 나이: "+getAge()+"\n"+
						"\t\t\t3. 색상: "+color+"\n";
		
		
		return result;
		
	}
}
