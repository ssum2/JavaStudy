package my.day15.ZooTest;

public class TestMain {

	public static void main(String[] args) {
		Animal[] aniArr = new Animal[5];
		
//		Animal a = new Animal(); 	>> XXXXXX
//		추상클래스는 객체로 만들 수 없음! 자식클래스의 내용을 받는 저장용기일 뿐임
		
		Dog dog = new Dog("뽀삐", 5, 8);
		Cat cat = new Cat("톰", 3, "black");
		Duck duck = new Duck("도널드", 4, 50000);
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = duck;
//		>> 인터페이스를 implements 한 클래스의 객체를 인터페이스형태의 배열에 넣을 수 있음! (like 부모클래스)
		
		for(int i=0; i<3; i++) {
			
			aniArr[i].crySound();
			System.out.println(aniArr[i].run());
			System.out.println("");
			
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=0; i<Animal.count; i++) {
			
//			공통적인 부분은 캐스팅 없이 바로 출력 가능
			System.out.println("1. 이름: "+aniArr[i].getName());
			System.out.println("2. 나이: "+aniArr[i].getAge());
			
//			특징적인 부분은 캐스팅 형태 검사 후 형변환 하여 출력
			if(aniArr[i] instanceof Dog)
				System.out.println("3. 체중: "+((Dog)aniArr[i]).getWeight()+"kg");
			else if(aniArr[i] instanceof Cat)
				System.out.println("3. 색상: "+((Cat)aniArr[i]).getColor());
			else if(aniArr[i] instanceof Duck)
				System.out.println("3. 가격: "+((Duck)aniArr[i]).getPrice()+"원");
			
			System.out.print("4. 소리: ");
			aniArr[i].crySound();
			System.out.println("5. 행동: "+aniArr[i].run());
			System.out.println("------------------------------------------");
		}
		
		
		
		
		
		
		
	} // end of main()

} // end of class
