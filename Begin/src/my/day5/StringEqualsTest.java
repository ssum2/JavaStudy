package my.day5;

public class StringEqualsTest {

	public static void main(String[] args) {
		
		String name1 = new String("이순신");
		String name2 = new String("이순신");
		
		String name3 = "강감찬";
		String name4 = "강감찬";
		
		if(name1 == name2) {
			System.out.println("name1과 name2는 같다.");
		}
		else {
			System.out.println("name1과 name2는 같지 않다.");
		}
		
		System.out.println("---------------------------");
		 
		if(name3 == name4) {
			System.out.println("name3과 name4는 같다.");
		}
		else {
			System.out.println("name3과 name4는 같지 않다.");
		}
		
//		name1과 name2는 같지 않다. ==>> String은 클래스이고, name n 객체를 생성한 것이기 때문에 주소값이  서로 달라 같지 않다고 나옴
//		-----------------------------
//		name3과 name4는 같다. ==>> 이 경우에는 객체가 아니라 변수를 선언해준 것으로 되어서 변수에 대입된 값을 비교 -> 같다고 나옴
		
		System.out.println("\n==============================\n");
		
		if(name1.equals(name2)) {
			// name1.equals(name2) 
			// == String name1의 값("이순신")과 String name2의 값("이순신")을 비교
			// ==>> 값이 동일하면 true, 다르면 false를 반환
			System.out.println("name1과 name2는 같다.");
		} else {
			System.out.println("name1과 name2는 같지 않다.");
		}
		
		System.out.println("---------------------------");
		
		if(name3.equals(name4)) {
			// name1.equals(name2) 
			// == String name1의 값("이순신")과 String name2의 값("이순신")을 비교
			// ==>> 값이 동일하면 true, 다르면 false를 반환
			System.out.println("name3과 name4는 같다.");
		} else {
			System.out.println("name3과 name4는 같지 않다.");
		}
		
		
		
		
		
		
		
		
		
		
	} // end of main()

}
