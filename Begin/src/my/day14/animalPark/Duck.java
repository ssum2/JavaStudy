package my.day14.animalPark;

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
		if(price<0)
			this.price=0;
		else
			this.price = price;
	}


	@Override
	public void crySound() {
		System.out.println("꽥꽥");
	}
	
	public void printDuck() {
		String str = "오리의 이름은 "+getName()+","+
					 "오리의 나이는 "+getAge()+"살,"+
					 "오리의 가격은 "+price+"원 입니다.";
		
		System.out.println(str+"\n");
	}
	@Override
	public String toString() {	// 조상클래스인 Object의 메소드 toString을 오버라이딩함
		
		String result = "\t=== "+getName()+"님의 정보===\n"+
						"\t\t\t1. 이름: "+getName()+"\n"+
						"\t\t\t2. 나이: "+getAge()+"\n"+
						"\t\t\t3. 가격: "+price+"\n";
		
		
		return result;
		
	}
}
