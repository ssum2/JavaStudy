package my.day14.animalPark;

public class TestMain {
	
	public static void main(String[] args) {
		Animal[] aniArr = new Animal[10];
		
		Dog dog = new Dog("뽀삐", 5, 8);
		Cat cat = new Cat("톰", 3, "black");
		Duck duck = new Duck("도널드", 4, 50000);
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = duck;
		
		for(int i=0; i<Animal.count; i++) {
			aniArr[i].crySound();
		}
			
		System.out.println("---------------------");
		((Dog)aniArr[0]).printDog();
		((Cat)aniArr[1]).printCat();
		((Duck)aniArr[2]).printDuck();
		System.out.println("---------------------");
		for(int i=0; i<Animal.count; i++) {
			if(aniArr[i] instanceof Dog)
				((Dog)aniArr[0]).printDog();
			else if(aniArr[i] instanceof Cat)
				((Cat)aniArr[1]).printCat();
			else if(aniArr[i] instanceof Duck)
				((Duck)aniArr[2]).printDuck();
		}
		
		
		System.out.println("dog.toString() 결과: "+dog.toString());
		System.out.println("cat.toString() 결과: "+cat.toString());
		System.out.println("duck.toString() 결과: "+duck.toString());
		/*
		 	dog.toString() 결과: my.day14.animalPark.Dog@7852e922
			cat.toString() 결과: my.day14.animalPark.Cat@4e25154f
			duck.toString() 결과: my.day14.animalPark.Duck@70dea4e
		 */
		
		System.out.println("dog.hashCode() 결과: "+dog.hashCode());
		System.out.println("cat.hashCode() 결과: "+cat.hashCode());
		System.out.println("duck.hashCode() 결과: "+duck.hashCode());
		/*
		 	toString의 16진수로 출력된 결과를 10진수로 바꿔줌
		 	dog.hashCode() 결과: 2018699554
			cat.hashCode() 결과: 1311053135
			duck.hashCode() 결과: 118352462	
		 */
		
		System.out.println("Integer.toHexString(dog.hashCode()) => "+Integer.toHexString(dog.hashCode()));
//		Integer.toHexString(dog.hashCode()) => 7852e922 (10진수를 16진수로 치환)

	}

}
