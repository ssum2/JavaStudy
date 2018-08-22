package my.day12.InheritanceEX;

public class polymorphismMain {
/*
 	다형성(polymorphism)
 		- 자식클래스로 생성된 객체는 부모클래스나 인터페이스의 타입으로 받을 수 있다는 개념
 		- 부모클래스 밑에 자식클래스가 여러개 있을 때, 각 자식클래스객체를 부모클래스 또는 인터페이스 형태로 저장 가능함
 */
	public static void main(String[] args) {
		Human[] humanArr = new Human[5];
		
		Human hm1 = new Human("인간1", 174.2f, 76);
		Man man1 = new Man("남자1", 190.3f, 89, "2018-11-20");
		Woman woman1 = new Woman("여성1", 170.4f, 65, "2018-08-27");
		Human hm2 = new Man("남운도", 189.4f, 71, "2018-10-20"); // 자식클래스 Man객체를 Human형태로 받을 수있음 (다형성)
		Human hm3 = new Woman("여수지", 157.4f, 58, "2018-12-17"); // 자식클래스 Woman객체를 Human형태로 받을 수있음 (다형성)
	
		humanArr[0] = hm1;
		humanArr[1] = man1; // Man형태의 객체 man1을 Human형 배열에 넣을 수 있음
		humanArr[2] = woman1; // Woman형태의 객체 woman1을 Human형 배열에 넣을 수 있음
		humanArr[3] = hm2;
		humanArr[4] = hm3;
		
		// instanceof연산자: 객체 instanceof 클래스명; 그 객체가 해당클래스의 인스턴스인가?(boolean형 리턴)
		//										그 객체는 해당클래스 형태로 받을 수 있는가?
		if(humanArr[0] instanceof Man) { // humanArr[0]은 Human클래스로 생성된 객체이기 때문에 false
			System.out.println("humanArr[0]은 Man 클래스로 생성된 인스턴스객체이다.");
		}
		else {
			System.out.println("humanArr[0]은 Man 클래스로 생성된 인스턴스객체가 아니다.");
		}
		
		if(humanArr[1] instanceof Man) {
			System.out.println("humanArr[1]은 Man 클래스로 생성된 인스턴스객체이다.");
		}
		else {
			System.out.println("humanArr[1]은 Man 클래스로 생성된 인스턴스객체가 아니다.");
		}
			
		System.out.println("\n-------------------------------------------------");
		
		for(int i=0; i<humanArr.length; i++) {
			if(humanArr[i] instanceof Woman) { //배열값이 Woman형태일 때
				((Woman)humanArr[i]).showInfo(); // 배열의 형태를 다른클래스 형태로 바꿀 때 강제형변환 
			}
			else if(humanArr[i] instanceof Man) { //배열값이 Man형태일 때
				((Man)humanArr[i]).showInfo();
			}
			else { // 배열값이 Human형태일 때
				humanArr[i].showInfo();
			}
		} // end of for	
	} // end of main()
} // end of class
