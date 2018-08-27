package my.day15.ZooTest;

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

	@Override
	public String run() {
		String result ="고양이 "+getName()+"이 점프를 해서 착지합니다.";
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
