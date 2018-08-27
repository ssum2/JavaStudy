package my.day15.ZooTest;

public class Duck extends Animal {

	private int price;
	
	
	public Duck() {}
	public Duck(String name, int age, int price) {
		super(name, age);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override
	public void crySound() {
		System.out.println("꽥꽥");
		
	}

	@Override
	public String run() {
		String result ="오리 "+getName()+"가 두 발로 헤엄쳐 건너가고 두 발로 걷습니다.";
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
