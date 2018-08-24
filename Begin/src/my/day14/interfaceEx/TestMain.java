package my.day14.interfaceEx;

public class TestMain {

	public static void main(String[] args) {
		InterAnimal[] interAniArr = new InterAnimal[5];
		
		Dog dog = new Dog("뽀삐", 5, 8);
		Cat cat = new Cat("톰", 3, "black");
		Duck duck = new Duck("도널드", 4, 50000);
		
		interAniArr[0] = dog;
		interAniArr[1] = cat;
		interAniArr[2] = duck;
//		>> 인터페이스를 implements 한 클래스의 객체를 인터페이스형태의 배열에 넣을 수 있음! (like 부모클래스)
		
		for(int i=0; i<3; i++) {
			
			interAniArr[i].crySound();
			System.out.println(interAniArr[i].run());
			System.out.println("");
			
		}
		
		System.out.println("\n--------------------------------------------------\n");
		
		for(int i=0; i<3; i++) {
			if(interAniArr[i] instanceof Dog) {
				System.out.println("1. 이름: "+((Dog)interAniArr[i]).getName());
				System.out.println("2. 나이: "+((Dog)interAniArr[i]).getAge());
				System.out.println("3. 체중: "+((Dog)interAniArr[i]).getWeight());
			}
			else if(interAniArr[i] instanceof Cat) {
				System.out.println("1. 이름: "+((Cat)interAniArr[i]).getName());
				System.out.println("2. 나이: "+((Cat)interAniArr[i]).getAge());
				System.out.println("3. 색상: "+((Cat)interAniArr[i]).getColor());
			}
			else if(interAniArr[i] instanceof Duck) {
				System.out.println("1. 이름: "+((Duck)interAniArr[i]).getName());
				System.out.println("2. 나이: "+((Duck)interAniArr[i]).getAge());
				System.out.println("3. 가격: "+((Duck)interAniArr[i]).getPrice());
			}
			System.out.print("4. 소리: ");
			interAniArr[i].crySound();
			System.out.println("5. 행동: "+interAniArr[i].run());
			System.out.println("------------------------------------------");
		}
		
		
		
		
		
		
		
	} // end of main()

} // end of class
