package my.day14.interfaceEx;

public class Cat implements InterAnimal {
	private String name;
	private int age;
	private String color;
	
	public Cat() {}
	public Cat(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
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

	@Override
	public String run() {
		String result ="고양이 "+name+"이 점프를 해서 착지합니다.";
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
